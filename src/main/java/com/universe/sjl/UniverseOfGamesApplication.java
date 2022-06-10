package com.universe.sjl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.universe.sjl.dao")
public class UniverseOfGamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniverseOfGamesApplication.class, args);
    }

}
