package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 防具
 * 甲胄，头盔，披风，腰带，靴子
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Armor extends Equipment {
    //气血值
    private BigDecimal bloodValue;
    //魔法值
    private BigDecimal magicValue;
    //物理防御力
    private BigDecimal physicalDefense;
    //魔法防御力
    private BigDecimal magicDefense;

    //体质
    private BigDecimal constitution = BigDecimal.ZERO;
    //耐力
    private BigDecimal endurance = BigDecimal.ZERO;
    //力量
    private BigDecimal force = BigDecimal.ZERO;
    //魔力
    private BigDecimal magic = BigDecimal.ZERO;
    //敏捷
    private BigDecimal agile = BigDecimal.ZERO;

    //物理防御力加成
    private BigDecimal physicalDefenseAddition = BigDecimal.ZERO;
    //魔法防御力加成
    private BigDecimal magicDefenseAddition = BigDecimal.ZERO;
    //移动速度
    private BigDecimal movingSpeed;
    //抗性
    private BigDecimal resistance;

    //特效栏
    private Map<String, SpecialEfficacy> specialEfficacyBar;
    //特技栏
    private Map<String, Skill> specialSkillBar;

    //耐久度上限
    private int durabilityMax = 0;
    //当前耐久度
    private int durabilityValue = 0;
    //打造者
    private String makerName;
}
