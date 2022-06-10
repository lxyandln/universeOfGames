package com.universe.sjl.controller;

import com.universe.sjl.entity.GameAdministrator;
import com.universe.sjl.service.complexService.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;


    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "hello";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<GameAdministrator> getAll() {
        List<GameAdministrator> all = testService.getAll();
        for (GameAdministrator gameAdministrator : all) {
            System.out.println(gameAdministrator);
        }

        return all;
    }
}
