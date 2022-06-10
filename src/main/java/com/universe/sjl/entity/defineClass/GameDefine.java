package com.universe.sjl.entity.defineClass;

import com.universe.sjl.entity.SpecialEfficacy;
import com.universe.sjl.entity.abstractClass.VirtualDefine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 游戏道具定义类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class GameDefine extends VirtualDefine {
    /**
     * 虚拟类型：
     * 通用：00
     * 品质：0白色普通，1绿色优秀，2蓝色稀有，3紫色史诗，4橙色传说，5银色灵性，6金色仙云，7红色神通，8七彩圣明，9九彩称号
     * 装备：10武器，11甲胄，12头盔，13披风，14腰带，15靴子，16项链，17手镯，18戒指，19面具，20法宝，21称号，22徽章
     * 装备类型：23弓，24弩，25宝珠，26符咒，27枪，28棒，29斧，30剑，31刀，32锏，33法杖，34匕，35刺，36钩锁，37飞刀，38袖箭，39盾牌
     * 武器攻击距离：40远距离，41长距离，42中距离，43短距离
     * 武器攻击类型：44穿透，45震荡，46法术，47特殊
     * 防具类型：48重甲，49皮甲，50布甲，51特殊
     * 职业：52战士，53法师，54弓箭手，55刺客，56医师，57符箓师
     * 灵宠：70宠物，71坐骑
     * 种族：80鳞族，81毛族，82羽族，83皮族
     * 材料：100石材，101木材，102食材，103药材，104灵晶，105药品，106烹饪
     */
    private String virtualType;
    //类型编码
    private String virtualTypeCode;
    //定义类型
    private String defineType;
    //定义编码
    private String defineTypeCode;
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
    //移动速度系数
    private BigDecimal movingSpeedFactor;
    //攻击速度系数
    private BigDecimal attackSpeedFactor;
    //施法速度系数
    private BigDecimal conjureSpeedFactor;
    //吸血系数
    private BigDecimal suckBloodFactor;
    //暴击率系数
    private BigDecimal criticalRateFactor;
    //暴击效果系数
    private BigDecimal criticalEffectRateFactor;
    //抗性系数
    private BigDecimal resistanceFactor;
    //耐久系数
    private BigDecimal durabilityFactor;
    //饱食系数
    private BigDecimal satietyDegreeFactor;
    //特性
    private SpecialEfficacy specialEfficacy;
}
