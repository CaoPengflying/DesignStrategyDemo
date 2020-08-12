package cpf.zzc.virtualwallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cpf.zzc.virtualwallet.bo.VirtualWalletBo;
import cpf.zzc.virtualwallet.domain.VirtualWallet;
import cpf.zzc.virtualwallet.entity.VirtualWalletTransactionEntity;
import cpf.zzc.virtualwallet.enums.Status;
import cpf.zzc.virtualwallet.mapper.VirtualWalletEntityMapper;
import cpf.zzc.virtualwallet.entity.VirtualWalletEntity;
import cpf.zzc.virtualwallet.service.VirtualWalletEntityService;
import cpf.zzc.virtualwallet.service.VirtualWalletTransactionEntityService;
import cpf.zzc.virtualwallet.util.ModelConvertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@Service
public class VirtualWalletEntityServiceImpl extends ServiceImpl<VirtualWalletEntityMapper, VirtualWalletEntity> implements VirtualWalletEntityService {
    @Resource
    private VirtualWalletTransactionEntityService virtualWalletTransactionEntityService;


    @Override
    public VirtualWalletBo getVirtualWallet(Long walletId) {
        VirtualWalletEntity byId = this.getById(walletId);
        VirtualWalletBo bo = new VirtualWalletBo();
        BeanUtils.copyProperties(byId, bo);
        return bo;
    }

    @Override
    public BigDecimal getBalance(Long walletId) {
        VirtualWalletEntity byId = this.getById(walletId);
        if (null != byId) {
            return byId.getBalance();
        }
        throw new RuntimeException("不存在该虚拟钱包");
    }

    @Override
    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity byId = this.getById(walletId);
        //贫血模型
        if (null != byId) {
            byId.setBalance(byId.getBalance().subtract(amount));
            this.updateById(byId);
        }
        //充血模型
        if (null != byId) {
            VirtualWallet convert = ModelConvertUtils.convert(byId, VirtualWallet.class);
            convert.debit(amount);
            VirtualWalletEntity update = ModelConvertUtils.convert(convert, VirtualWalletEntity.class);
            this.updateById(update);
        }
    }

    @Override
    public void credit(Long walletId, BigDecimal amount) {
        //贫血模型
        VirtualWalletEntity byId = this.getById(walletId);
        if (null != byId) {
            byId.setBalance(byId.getBalance().add(amount));
            this.updateById(byId);
        }
        //充血模型
        if (null != byId) {
            VirtualWallet convert = ModelConvertUtils.convert(byId, VirtualWallet.class);
            convert.credit(amount);
            VirtualWalletEntity update = ModelConvertUtils.convert(convert, VirtualWalletEntity.class);
            this.updateById(update);
        }
    }

    @Override
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(new Date());
        transactionEntity.setFromVirtualWallet(fromWalletId);
        transactionEntity.setToVirtualWallet(toWalletId);
        transactionEntity.setStatus(Status.TO_BE_EXECUTED.getCode());
        virtualWalletTransactionEntityService.save(transactionEntity);
        debit(fromWalletId, amount);
        credit(toWalletId, amount);
        transactionEntity.setStatus(Status.EXECUTED.getCode());
        virtualWalletTransactionEntityService.updateById(transactionEntity);
    }
}

