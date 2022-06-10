package com.universe.sjl.entity.abstractClass;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 游戏角色
 */
@NoArgsConstructor
@Data
@Accessors
public abstract class Character extends VirtualGoods {
    //登陆账号
    private String landAccount;
    //登陆密码
    private String landPassword;
    //角色权限
    private String characterCompetence;
    //登录时间
    private Date landDate;
    //登陆地址
    private String landIP;
    //登陆地区
    private String landRegion;
}
