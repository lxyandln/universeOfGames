package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * 法宝
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class MagicWeapon extends Equipment {
    //灵力值上限
    private int energyMax;
    //当前灵力值
    private int energyValue;

    //特效栏
    private Map<String, SpecialEfficacy> specialEfficacyBar;
    //特技栏
    private Map<String, Skill> specialSkillBar;
}
