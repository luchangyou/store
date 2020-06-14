package com.lcy.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by Administrator on 2020/6/6.
 */
@Data
@TableName(value = "order_info")
public class OrderInfo extends BaseEntity{

    private String orderNo;

    private String waybillNo;
}
