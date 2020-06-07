package com.lcy.store.entity;

import lombok.Data;

/**
 * Created by Administrator on 2020/6/6.
 */
@Data
public class Waybill extends BaseEntity{

    private String waybillNo;

    private String orderNo;
}
