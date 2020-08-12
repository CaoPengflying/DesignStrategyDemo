package cpf.zzc.virtualwallet.controller;

import cpf.zzc.virtualwallet.service.VirtualWalletEntityService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * date 2020/8/10
 *
 * @author caopengflying
 */
@Controller
public class VirtualWalletController {
    @Resource
    private VirtualWalletEntityService virtualWalletEntityService;

    /**
     * 获取余额
     * @param walletId
     * @return
     */
    public BigDecimal getBalance(Long walletId) {
        return null;
    }

    /**
     * 出帐
     * @param walletId
     * @param amount
     */
    public void debit(Long walletId, BigDecimal amount) {

    }

    /**
     * 入账
     * @param walletId
     * @param amount
     */
    public void credit(Long walletId, BigDecimal amount) {

    }

    /**
     * 转账
     * @param fromWalletId
     * @param toWalletId
     * @param amount
     */
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {

    }
}
