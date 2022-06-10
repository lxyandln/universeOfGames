package com.universe.sjl.service.directImpl;

import com.universe.sjl.dao.GameDefineDAO;
import com.universe.sjl.entity.defineClass.GameDefine;
import com.universe.sjl.service.directService.GameDefineService;
import com.universe.sjl.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class GameDefineServiceImpl implements GameDefineService {
    @Autowired
    private GameDefineDAO gameDefineDAO;

    @Override
    public void insertGameDefine(GameDefine gameDefine) throws RuntimeException {
        gameDefineDAO.insertGameDefine(gameDefine);
    }

    @Override
    public void deleteGameDefine(String id) throws RuntimeException {
        gameDefineDAO.updateGameDefineWithCancelFlagById(id, Constants.NONE_ZERO);
    }

    @Override
    public void recoverGameDefine(String id) throws RuntimeException {
        gameDefineDAO.updateGameDefineWithCancelFlagById(id, Constants.HAVE_ONE);
    }

    @Override
    public void updateGameDefine(GameDefine gameDefine) throws RuntimeException {
        gameDefineDAO.updateGameDefine(gameDefine);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<GameDefine> selectGameDefineClassify(Map<String, Object> param) throws RuntimeException {
        return gameDefineDAO.selectGameDefineClassify(param);
    }
}
