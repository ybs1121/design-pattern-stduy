package com.example.designpattern.어댑터패턴;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {


    @org.junit.jupiter.api.Test
    void test() {
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testDuck(turkeyAdapter);

    }

    void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
