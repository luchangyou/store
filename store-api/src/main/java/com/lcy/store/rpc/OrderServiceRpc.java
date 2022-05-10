package com.lcy.store.rpc;

import com.lcy.store.dto.OrderInfoDTO;

public interface OrderServiceRpc {

    public OrderInfoDTO getByOrderNo(String orderNo);
}
