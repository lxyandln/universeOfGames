package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.SpiritualityPet;
import com.universe.sjl.entity.defineClass.GameDefine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

/**
 * 坐骑
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Mount extends SpiritualityPet {
    //姓名
    private String name;
    //种族
    private GameDefine race;
    //品质
    private GameDefine qualityGameDefine;
    //游戏等级
    private int gameLevel;
    //体质增强
    private BigDecimal constitutionIncrease;
    //耐力增强
    private BigDecimal enduranceIncrease;
    //力量增强
    private BigDecimal forceIncrease;
    //魔力增强
    private BigDecimal magicIncrease;
    //敏捷增强
    private BigDecimal agileIncrease;

    //移动速度增强
    private BigDecimal movingSpeedIncrease;
    //攻击速度增强
    private BigDecimal attackSpeedIncrease;
    //施法速度增强
    private BigDecimal conjureSpeedIncrease;
    //吸血增强
    private BigDecimal suckBloodIncrease;
    //暴击率增强
    private BigDecimal criticalRateIncrease;
    //暴击效果增强
    private BigDecimal criticalEffectRateIncrease;
    //抗性增强
    private BigDecimal resistanceIncrease;

    //骑乘等级
    private int carryLevel;
    //坐骑韧性
    private BigDecimal toughness;

    //饱食度上限
    private BigDecimal satietyDegreeMax;
    //当前饱食度
    private BigDecimal satietyDegreeValue;

    //技能栏
    private List<Skill> skillBar;
}
