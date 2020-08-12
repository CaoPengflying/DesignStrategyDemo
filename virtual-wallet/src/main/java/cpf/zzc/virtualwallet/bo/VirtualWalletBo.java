package cpf.zzc.virtualwallet.bo;

import java.math.BigDecimal;
import lombok.*;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
@Data
public class VirtualWalletBo {
    private Long id;
    private Long createTime;
    private BigDecimal balance;
}
