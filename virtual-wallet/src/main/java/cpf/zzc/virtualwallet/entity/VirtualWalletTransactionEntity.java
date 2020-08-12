package cpf.zzc.virtualwallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.*;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName(value = "virtual_wallet_transaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VirtualWalletTransactionEntity implements Serializable {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@TableField("from_virtual_wallet")
	private Long fromVirtualWallet;
	@TableField("to_virtual_wallet")
	private Long toVirtualWallet;
	@TableField("amount")
	private BigDecimal amount;
	@TableField("status")
	private Integer status;
	@TableField("create_time")
	private Date createTime;

}

