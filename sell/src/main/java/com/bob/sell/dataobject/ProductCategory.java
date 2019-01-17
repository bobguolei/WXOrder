package com.bob.sell.dataobject;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Data
public class ProductCategory {

  @Id
  @GeneratedValue
  private Integer categoryId;
  private String categoryName;
  private Integer categoryType;
//  private Date createTime;
//  private Date updateTime;


  public ProductCategory() {
  }

  public ProductCategory(String categoryName, Integer categoryType) {
    this.categoryName = categoryName;
    this.categoryType = categoryType;
  }
}
