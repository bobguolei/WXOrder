package com.bob.sell.dataobject;

import com.bob.sell.enums.OrderStatusEnum;
import com.bob.sell.enums.PayStatusEnum;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
  @Id
  private String orderId;
  private String buyerName;
  private String buyerPhone;
  private String buyerAddress;
  private String buyerOpenid;
  private BigDecimal orderAmount;
  private Integer orderStatus = OrderStatusEnum.NEW.getCode();
  private Integer payStatus = PayStatusEnum.WAIT.getCode();
  private Date createTime;
  private Date updateTime;

}
