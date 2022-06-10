package com.universe.sjl.service.complexImpl;

import com.universe.sjl.dao.TestDAO;
import com.universe.sjl.entity.GameAdministrator;
import com.universe.sjl.service.complexService.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDAO testDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<GameAdministrator> getAll() {
        return testDAO.getAll();
    }
}
