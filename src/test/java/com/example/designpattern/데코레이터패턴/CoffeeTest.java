package com.example.designpattern.데코레이터패턴;

import com.example.designpattern.데코레이터패턴.beverage.Beverage;
import com.example.designpattern.데코레이터패턴.beverage.HouseBlend;
import com.example.designpattern.데코레이터패턴.beverage.Mocha;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CoffeeTest {


    @Test
    void test(){
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());

    }

}
