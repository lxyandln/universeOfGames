package com.universe.sjl.service.complexService;

import com.universe.sjl.entity.defineClass.GameDefine;

import java.util.List;

public interface AssembleGameDefineService {
    /**
     * 新增游戏配置
     *
     * @param gameDefine
     * @throws RuntimeException
     */
    void insertGameDefine(GameDefine gameDefine) throws RuntimeException;

    /**
     * 失效/恢复游戏配置
     *
     * @param id
     * @throws RuntimeException
     */
    void deleteGameDefine(String id) throws RuntimeException;

    /**
     * 失效/恢复游戏配置
     *
     * @param id
     * @throws RuntimeException
     */
    void recoverGameDefine(String id) throws RuntimeException;

    /**
     * 修改游戏配置
     *
     * @param gameDefine
     * @throws RuntimeException
     */
    void updateGameDefine(GameDefine gameDefine) throws RuntimeException;

    /**
     * 分类查询游戏配置
     *
     * @param param
     * @throws RuntimeException
     */
    List<GameDefine> selectGameDefineClassify(String defineType, int page) throws RuntimeException;


}
