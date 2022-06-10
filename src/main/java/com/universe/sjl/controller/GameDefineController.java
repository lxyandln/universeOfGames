package com.universe.sjl.controller;

import com.universe.sjl.entity.defineClass.GameDefine;
import com.universe.sjl.service.complexService.AssembleGameDefineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/gameDefine")
public class GameDefineController {
    @Autowired
    private AssembleGameDefineService assembleGameDefineService;

    @ResponseBody
    @RequestMapping("/insertGameDefine")
    public void insertGameDefine(GameDefine gameDefine) {
        assembleGameDefineService.insertGameDefine(gameDefine);
    }

    @ResponseBody
    @RequestMapping("/deleteGameDefine")
    public void deleteGameDefine(String id) {
        assembleGameDefineService.deleteGameDefine(id);
    }

    @ResponseBody
    @RequestMapping("/recoverGameDefine")
    public void recoverGameDefine(String id) {
        assembleGameDefineService.recoverGameDefine(id);
    }

    @ResponseBody
    @RequestMapping("/updateGameDefine")
    public void updateGameDefine(GameDefine gameDefine) {
        assembleGameDefineService.updateGameDefine(gameDefine);
    }

    @ResponseBody
    @RequestMapping("/selectGameDefineClassify")
    public List<GameDefine> selectGameDefineClassify(String defineType, Integer page) {
        return assembleGameDefineService.selectGameDefineClassify(defineType, page);
    }

}
