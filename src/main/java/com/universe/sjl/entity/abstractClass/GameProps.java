package com.universe.sjl.entity.abstractClass;

import com.universe.sjl.entity.defineClass.GameDefine;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 游戏道具
 */
@NoArgsConstructor
@Data
@Accessors
public abstract class GameProps extends VirtualGoods {
    //类型
    private GameDefine equipmentGameDefine;
    //品质
    private GameDefine qualityGameDefine;
    //玩家编号：0无人拥有
    private String playerId = "0";
    //是否任务物品：0否，1是
    private String taskGoods = "0";
}
