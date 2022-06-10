package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 装饰
 * 项链，手镯，戒指，面具
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Ornaments extends Equipment {
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

    //物理攻击加成
    private BigDecimal physicalAttackAddition = BigDecimal.ZERO;
    //魔法攻击加成
    private BigDecimal magicAttackAddition = BigDecimal.ZERO;
    //物理防御力加成
    private BigDecimal physicalDefenseAddition = BigDecimal.ZERO;
    //魔法防御力加成
    private BigDecimal magicDefenseAddition = BigDecimal.ZERO;
    //移动速度
    private BigDecimal movingSpeed = BigDecimal.ZERO;
    //攻击速度
    private BigDecimal attackSpeed = BigDecimal.ZERO;
    //施法速度
    private BigDecimal conjureSpeed = BigDecimal.ZERO;
    //吸血
    private BigDecimal suckBlood = BigDecimal.ZERO;
    //暴击率
    private BigDecimal criticalRate = BigDecimal.ZERO;
    //暴击效果
    private BigDecimal criticalEffectRate = BigDecimal.ZERO;
    //抗性
    private BigDecimal resistance = BigDecimal.ZERO;

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
