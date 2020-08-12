package cpf.zzc.virtualwallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cpf.zzc.virtualwallet.mapper.VirtualWalletTransactionEntityMapper;
import cpf.zzc.virtualwallet.entity.VirtualWalletTransactionEntity;
import cpf.zzc.virtualwallet.service.VirtualWalletTransactionEntityService;
import org.springframework.stereotype.Service;
@Service
public class VirtualWalletTransactionEntityServiceImpl extends ServiceImpl<VirtualWalletTransactionEntityMapper, VirtualWalletTransactionEntity> implements VirtualWalletTransactionEntityService  {
}

