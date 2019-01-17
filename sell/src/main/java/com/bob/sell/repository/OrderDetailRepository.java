package com.bob.sell.repository;

import com.bob.sell.dataobject.OrderDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
  List<OrderDetail> findByOrderId(String orderId);
}
