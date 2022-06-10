package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.GameProps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 技能
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Skill extends GameProps {
    //名称
    private String name;
    //学习等级
    private int skillLevel;
    //学习条件
    private String requirement;
    //技能类型：0被动，1主动
    private String type;
    //作用类型：0辅助，1攻击
    private String resultType;
    //释放类型：0物理，1魔法，2特殊
    private String dischargeType;
    //技能等级
    private int proficiencyLevel = 0;
    //技能范围
    private int range;
    //消耗气血
    private BigDecimal bloodValueConsume = BigDecimal.ZERO;
    //消耗魔法
    private BigDecimal magicValueConsume = BigDecimal.ZERO;
    //技能效果
    private String effect;

    //技能熟练度上限
    private BigDecimal proficiencyMax;
    //当前技能熟练度
    private BigDecimal proficiencyValue;
    //当前技能等级
    private int gameLevel = 0;
}
