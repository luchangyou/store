package com.lcy.store.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.lcy.store.dto.OrderInfoDTO;
import com.lcy.store.entity.OrderInfo;
import com.lcy.store.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class OrderServiceRpcImpl implements OrderServiceRpc{

    @Autowired
    private OrderService orderService;

    @Override
    public OrderInfoDTO getByOrderNo(String orderNo) {
        OrderInfoDTO orderInfoDTO = new OrderInfoDTO();
        OrderInfo orderInfo = orderService.getByOrderNo(orderNo);
        if (orderInfo != null) {
            BeanUtils.copyProperties(orderInfo,orderInfoDTO);
        }

        return orderInfoDTO;
    }
}
