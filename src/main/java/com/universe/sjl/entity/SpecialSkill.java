package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.GameProps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 特技
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class SpecialSkill extends GameProps {
    //名称
    private String name;
    //技能类型：0被动，1主动
    private String type = "1";
    //作用类型：0辅助，1攻击
    private String resultType;
    //释放类型：0物理，1魔法，2特殊
    private String dischargeType;
    //技能范围
    private int range;
    //消耗气血
    private BigDecimal bloodValueConsume = BigDecimal.ZERO;
    //消耗魔法
    private BigDecimal magicValueConsume = BigDecimal.ZERO;
    //消耗怒气
    private BigDecimal angerValueConsume = BigDecimal.ZERO;
    //技能效果
    private String effect;

}
