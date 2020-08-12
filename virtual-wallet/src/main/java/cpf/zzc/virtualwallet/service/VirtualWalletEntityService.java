package cpf.zzc.virtualwallet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cpf.zzc.virtualwallet.bo.VirtualWalletBo;
import cpf.zzc.virtualwallet.entity.VirtualWalletEntity;

import java.math.BigDecimal;

public interface VirtualWalletEntityService extends IService<VirtualWalletEntity> {
    /**
     * 获取虚拟钱包
     *
     * @param walletId
     * @return
     */
    VirtualWalletBo getVirtualWallet(Long walletId);

    /**
     * 查询余额
     *
     * @param walletId
     * @return
     */
    BigDecimal getBalance(Long walletId);

    /**
     * 出账
     *
     * @param walletId
     * @param amount
     */
    void debit(Long walletId, BigDecimal amount);

    /**
     * 进账
     *
     * @param walletId
     * @param amount
     */
    void credit(Long walletId, BigDecimal amount);

    /**
     * 转账
     *
     * @param fromWalletId
     * @param toWalletId
     * @param amount
     */
    void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount);

}

