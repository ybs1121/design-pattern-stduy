package com.example.designpattern.전략패턴.duck;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DuckTest {

    @Test
    void duck() {
        Duck yellowDuck = new YellowDuck();
        yellowDuck.performFly();
        yellowDuck.performQuack();
    }
}
