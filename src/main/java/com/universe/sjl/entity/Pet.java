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
 * 御灵
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Pet extends SpiritualityPet {

    //姓名
    private String name;
    //种族
    private GameDefine race;
    //品质
    private GameDefine qualityGameDefine;
    //游戏等级
    private int gameLevel;
    //体质
    private BigDecimal constitution;
    //耐力
    private BigDecimal endurance;
    //力量
    private BigDecimal force;
    //魔力
    private BigDecimal magic;
    //敏捷
    private BigDecimal agile;
    //气血值
    private BigDecimal bloodValue;
    //魔法值
    private BigDecimal magicValue;
    //物理攻击力
    private BigDecimal physicalAttack;
    //魔法攻击力
    private BigDecimal magicAttack;
    //物理防御力
    private BigDecimal physicalDefense;
    //魔法防御力
    private BigDecimal magicDefense;
    //移动速度
    private BigDecimal movingSpeed;
    //攻击速度
    private BigDecimal attackSpeed;
    //施法速度
    private BigDecimal conjureSpeed;
    //吸血
    private BigDecimal suckBlood;
    //暴击率
    private BigDecimal criticalRate;
    //暴击效果
    private BigDecimal criticalEffectRate;
    //抗性
    private BigDecimal resistance;

    //携带等级
    private int carryLevel;
    //体质系数
    private BigDecimal constitutionFactor;
    //耐力系数
    private BigDecimal enduranceFactor;
    //力量系数
    private BigDecimal forceFactor;
    //魔力系数
    private BigDecimal magicFactor;
    //敏捷系数
    private BigDecimal agileFactor;
    //成长系数
    private BigDecimal growFactor;

    //饱食度
    private BigDecimal satietyDegreeMax;
    //当前饱食度
    private BigDecimal satietyDegreeValue;

    //技能栏
    private List<Skill> skillBar;
}
