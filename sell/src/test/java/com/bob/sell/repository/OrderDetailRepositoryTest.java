package com.bob.sell.repository;

import com.bob.sell.dataobject.OrderDetail;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

  @Autowired
  private OrderDetailRepository repository;

  @Test
  public void saveTest() {
    OrderDetail orderDetail = new OrderDetail();
    orderDetail.setDetailId("1234567890");
    orderDetail.setOrderId("11111132");
    orderDetail.setProductIcon("http://xxxx.jpg");
    orderDetail.setProductId("11111143");
    orderDetail.setProductName("小米粥");
    orderDetail.setProductPrice(new BigDecimal(1.2));
    orderDetail.setProductQuantity(4);

    OrderDetail result = repository.save(orderDetail);
    Assert.assertNotNull(result);
  }

  @Test
  public void findByOrderId() throws Exception {
    List<OrderDetail> orderDetailList = repository.findByOrderId("11111112");
    Assert.assertNotEquals(0, orderDetailList.size());
  }

}