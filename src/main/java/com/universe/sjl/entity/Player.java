package com.universe.sjl.entity;

import com.universe.sjl.entity.abstractClass.Character;
import com.universe.sjl.entity.abstractClass.Equipment;
import com.universe.sjl.entity.abstractClass.GameProps;
import com.universe.sjl.entity.abstractClass.SpiritualityPet;
import com.universe.sjl.entity.defineClass.GameDefine;
import com.universe.sjl.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 玩家
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class Player extends Character {

    //姓名
    private String name;
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
    //怒气值上限
    private BigDecimal angryMax;
    //怒气值
    private BigDecimal angryValue;
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
    //魅力值
    private BigDecimal charmValue;
    //幸运值
    private BigDecimal luckyValue;

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
    //抗性系数
    private BigDecimal resistanceFactor;

    //称号
    private Nickname nickname;
    //武器
    private Weapon weapon;
    //护甲
    private Armor breastplate;
    //头盔
    private Armor helmet;
    //腰带
    private Armor waistband;
    //靴子
    private Armor boots;
    //披风
    private Armor mantle;

    //面具
    private Ornaments mask;
    //项链
    private Ornaments necklace;
    //戒指（左）
    private Ornaments ringLeft;
    //戒指（右）
    private Ornaments ringRight;
    //手镯（左）
    private Ornaments braceletLeft;
    //手镯（右）
    private Ornaments braceletRight;

    //宠物
    private Pet pet;
    //坐骑
    private Mount mount;

    //物品栏
    private List<Map<GameProps, Integer>> inventory;
    //称号簿
    private List<Nickname> nicknameBar;
    //徽章栏
    private List<Badge> badgeBar;
    //宠物栏
    private List<Pet> petBar;
    //坐骑栏
    private List<Mount> mountBar;
    //职业栏
    private Map<String, GameDefine> gameCareerBar;

    //装备栏
    private Map<String, Equipment> equipmentBar;
    //法宝栏
    private Map<String, MagicWeapon> magicWeaponBar;
    //技能栏
    private List<Skill> skillBar;
    //已出战灵性宠物
    private Map<String, SpiritualityPet> wornSpiritualityPets;

    //饱食度上限
    private BigDecimal sMax;
    //当前饱食度
    private BigDecimal satietyDegree;
    //经验值上限
    private BigDecimal empiricalMax;
    //当前经验值
    private BigDecimal empiricalValue;

    //展示移动速度百分比
    public String displayMovingSpeedPercentage() {
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal movingSpeedPercentage = movingSpeed.divide(percentage, BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP);
        return movingSpeedPercentage + "%";
    }

    //展示攻击速度百分比
    public String displayAttackSpeedPercentage() {
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal attackSpeedPercentage = attackSpeed.divide(percentage, BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP);
        return attackSpeedPercentage + "%";
    }

    //展示施法速度百分比
    public String displayConjureSpeedPercentage() {
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal conjureSpeedPercentage = conjureSpeed.divide(percentage, BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP);
        return conjureSpeedPercentage + "%";
    }

    //展示吸血百分比
    public String displaySuckBloodPercentage() {
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal suckBloodPercentage = suckBlood.divide(percentage, BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP);
        return suckBloodPercentage + "%";
    }

    //展示暴击率百分比
    public String displayCriticalRatePercentage() {
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal criticalRatePercentage = criticalRate.divide(percentage, BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP);
        return criticalRatePercentage + "%";
    }

    //展示暴击效果百分比
    public String displayCriticalEffectRatePercentage() {
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal criticalEffectRatePercentage = criticalEffectRate.divide(percentage, BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP);
        return criticalEffectRatePercentage + "%";
    }

    @Override
    public String toString() {
        return "【角色：" + name + "】" + "\n"
                + "【等级：" + gameLevel + "】" + "\n"
                + "【职业：" + gameCareerBar.get(Constants.FIGHT_GAME_CAREER).getName() + "】" + "\n"
                + "【称号：" + nickname.getName() + "】" + "\n"
                + "【气血值：" + bloodValue + "/" + bloodValue + "】" + "\n"
                + "【魔法值：" + magicValue + "/" + magicValue + "】" + "\n"
                + "【怒气值：" + angryValue + "/" + angryMax + "】" + "\n"
                + "【体质：" + constitution + "】" + "\n"
                + "【耐力：" + endurance + "】" + "\n"
                + "【力量：" + force + "】" + "\n"
                + "【魔力：" + magic + "】" + "\n"
                + "【敏捷：" + agile + "】" + "\n"
                + "【物理攻击力：" + physicalAttack + "】" + "\n"
                + "【魔法攻击力：" + magicAttack + "】" + "\n"
                + "【物理防御力：" + physicalDefense + "】" + "\n"
                + "【魔法防御力：" + magicDefense + "】" + "\n"
                + "【移动速度：" + displayMovingSpeedPercentage() + "】" + "\n"
                + "【攻击速度：" + displayAttackSpeedPercentage() + "】" + "\n"
                + "【施法速度：" + displayConjureSpeedPercentage() + "】" + "\n"
                + "【吸血：" + displaySuckBloodPercentage() + "】" + "\n"
                + "【暴击率：" + displayCriticalRatePercentage() + "】" + "\n"
                + "【暴击效果：" + displayCriticalEffectRatePercentage() + "】" + "\n"
                + "【抗性：" + resistance + "】" + "\n"
                + "【魅力值：" + charmValue + "】" + "\n"
                + "【幸运值：" + luckyValue + "】" + "\n"
                + "【饱食度：" + satietyDegree + "】" + "\n"
                + "【经验值：" + empiricalValue + "/" + empiricalMax + "】" + "\n";
    }
}
