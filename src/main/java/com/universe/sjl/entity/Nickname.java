package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 称号
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Nickname extends Equipment {
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

    //物理攻击加成
    private BigDecimal physicalAttackAddition = BigDecimal.ZERO;
    //魔法攻击加成
    private BigDecimal magicAttackAddition = BigDecimal.ZERO;
    //物理防御力加成
    private BigDecimal physicalDefenseAddition = BigDecimal.ZERO;
    //魔法防御力加成
    private BigDecimal magicDefenseAddition = BigDecimal.ZERO;
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

    //魅力值
    private BigDecimal charmValue;
    //幸运值
    private BigDecimal luckyValue;
}
