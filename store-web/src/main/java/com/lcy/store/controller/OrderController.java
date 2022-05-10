package com.lcy.store.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcy.store.dto.OrderInfoDTO;
import com.lcy.store.rpc.OrderServiceRpc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Reference
    private OrderServiceRpc orderServiceRpc;

    @RequestMapping("/getOrder")
    @ResponseBody
    public OrderInfoDTO getOrderByOrderNo(@RequestParam("orderNo")String orderNo){
        OrderInfoDTO orderInfoDTO = orderServiceRpc.getByOrderNo(orderNo);
        return orderInfoDTO;
    }
}
