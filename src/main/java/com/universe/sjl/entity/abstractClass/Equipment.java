package com.universe.sjl.entity.abstractClass;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 装备
 */
@NoArgsConstructor
@Data
@Accessors
public abstract class Equipment extends GameProps {
    //携带等级
    private int gameLevel = 0;
    //佩戴标志：0未佩戴，1已佩戴
    private String wearFlag = "0";
}
