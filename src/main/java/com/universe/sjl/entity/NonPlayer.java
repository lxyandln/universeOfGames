package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Character;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 非玩家
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class NonPlayer extends Character {
    //姓名
    private String name;
    //游戏等级
    private int gameLevel;
}
