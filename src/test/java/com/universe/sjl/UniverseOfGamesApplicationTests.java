package com.universe.sjl;

import com.universe.sjl.entity.GameAdministrator;
import com.universe.sjl.service.complexService.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = UniverseOfGamesApplication.class)
@RunWith(SpringRunner.class)
public class UniverseOfGamesApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void contextLoads() {
        List<GameAdministrator> all = testService.getAll();
        for (GameAdministrator gameAdministrator : all) {
            System.out.println(gameAdministrator);
        }
    }

}
