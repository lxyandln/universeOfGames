package com.universe.sjl.entity.abstractClass;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 虚拟物品
 */
@NoArgsConstructor
@Data
@Accessors
public abstract class VirtualGoods implements Serializable {
    //编号
    private String id;
    //名称
    private String name;
    private String createBy = "admin";
    private Date createDate = new Date();
    private String updateBy = "admin";
    private Date updateDate = new Date();

    //概述
    private String summary;
    //注销标志：0注销，1有效
    private String cancelFlag = "1";
    //版本号
    private String versionNumber;
}
