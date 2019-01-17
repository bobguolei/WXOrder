package com.bob.sell.converter;

import com.bob.sell.dataobject.OrderMaster;
import com.bob.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConverter {

  public static OrderDTO convert(OrderMaster orderMaster) {

    OrderDTO orderDTO = new OrderDTO();
    BeanUtils.copyProperties(orderMaster, orderDTO);
    return orderDTO;
  }

  public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
    return orderMasterList.stream().map(OrderMaster2OrderDTOConverter::convert
    ).collect(Collectors.toList());
  }
}
