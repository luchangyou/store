package com.lcy.store.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderInfoDTO implements Serializable {

    private String orderNo;

    private String waybillNo;
}
