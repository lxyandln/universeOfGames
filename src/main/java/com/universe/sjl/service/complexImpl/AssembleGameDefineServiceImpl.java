package com.universe.sjl.service.complexImpl;

import com.universe.sjl.entity.defineClass.GameDefine;
import com.universe.sjl.service.complexService.AssembleGameDefineService;
import com.universe.sjl.service.directService.GameDefineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AssembleGameDefineServiceImpl implements AssembleGameDefineService {
    @Autowired
    private GameDefineService gameDefineService;

    @Override
    public void insertGameDefine(GameDefine gameDefine) throws RuntimeException {
        gameDefineService.insertGameDefine(gameDefine);
    }

    @Override
    public void deleteGameDefine(String id) throws RuntimeException {
        gameDefineService.deleteGameDefine(id);
    }

    @Override
    public void recoverGameDefine(String id) throws RuntimeException {
        gameDefineService.recoverGameDefine(id);
    }

    @Override
    public void updateGameDefine(GameDefine gameDefine) throws RuntimeException {
        gameDefineService.updateGameDefine(gameDefine);
    }

    @Override
    public List<GameDefine> selectGameDefineClassify(String defineType, int page) throws RuntimeException {
        //默认每页10条数据
        Map param = new HashMap();
        param.put("defineType", defineType);
        param.put("start", page);
        param.put("rows", 10);

        return gameDefineService.selectGameDefineClassify(param);
    }
}
