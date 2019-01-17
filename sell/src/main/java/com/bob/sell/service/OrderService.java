package com.bob.sell.service;

import com.bob.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by 廖师兄
 * 2017-06-11 18:23
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
    OrderDTO findOne(String orderId);
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    OrderDTO cancel(OrderDTO orderDTO);
    OrderDTO finish(OrderDTO orderDTO);
    OrderDTO paid(OrderDTO orderDTO);
//    Page<OrderDTO> findList(Pageable pageable);

}
