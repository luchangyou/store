package com.lcy.store.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime = new Date();

    /**
     * 创建人
     */
    private String createUser = "system";

    /**
     * 更新时间
     */
    private Date updateTime = new Date();

    /**
     * 更新人
     */
    private String updateUser = "system";

    /**
     * 版本号
     */
    private int version = 0;

    /**
     * 删除标志
     */
    private Boolean isDelete = false;

    /**
     * 时间戳
     */
    private Date ts;

}
