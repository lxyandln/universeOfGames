package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 徽章
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Badge extends Equipment {
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

    //特效栏
    private Map<String, SpecialEfficacy> specialEfficacyBar;
    //特技栏
    private Map<String, Skill> specialSkillBar;
}
