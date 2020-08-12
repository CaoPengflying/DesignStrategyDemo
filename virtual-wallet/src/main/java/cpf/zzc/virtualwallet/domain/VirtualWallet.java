package cpf.zzc.virtualwallet.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
@Data
public class VirtualWallet implements Serializable {
    private Integer id;
    private Date createTime;
    private BigDecimal balance;

    /**
     * 出账
     * @param amount
     */
    public void debit( BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    /**
     * 进账
     *
     * @param amount
     */
    public void credit(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }
}
