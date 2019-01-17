package com.bob.sell.dataobject;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductInfo {
  @Id
  private String productId;

  /** 名字. */
  private String productName;

  /** 单价. */
  private BigDecimal productPrice;

  /** 库存. */
  private Integer productStock;

  /** 描述. */
  private String productDescription;

  /** 小图. */
  private String productIcon;

  /** 状态, 0正常1下架. */
  private Integer productStatus;

  /** 类目编号. */
  private Integer categoryType;

}