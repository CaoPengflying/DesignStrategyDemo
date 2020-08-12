package cpf.zzc.virtualwallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.*;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName(value = "virtual_wallet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VirtualWalletEntity implements Serializable {
	@TableField("id")
	private Integer id;
	@TableField("create_time")
	private Date createTime;
	@TableField("balance")
	private BigDecimal balance;

}

