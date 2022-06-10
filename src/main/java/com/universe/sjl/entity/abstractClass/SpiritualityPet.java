package com.universe.sjl.entity.abstractClass;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 灵性宠物
 */
@NoArgsConstructor
@Data
@Accessors
public abstract class SpiritualityPet extends VirtualGoods {
    //出战标志：0未出战，1出战
    private String combatFlag = "0";
}
