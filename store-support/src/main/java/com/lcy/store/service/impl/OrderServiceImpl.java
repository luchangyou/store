package com.lcy.store.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcy.store.dto.OrderInfoDTO;
import com.lcy.store.entity.OrderInfo;
import com.lcy.store.mapper.OrderMapper;
import com.lcy.store.service.OrderService;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

/**
 * Created by Administrator on 2020/6/6.
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderInfo> implements OrderService {

    @Override
    public OrderInfo getByOrderNo(String orderNo) {
        QueryWrapper wrapper = new QueryWrapper<OrderInfo>();
        wrapper.eq("order_no",orderNo);

        return baseMapper.selectOne(wrapper);
    }
}
