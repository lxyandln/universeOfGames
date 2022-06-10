package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Character;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 管理员
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class GameAdministrator extends Character {
    //姓名
    private String name;
}
