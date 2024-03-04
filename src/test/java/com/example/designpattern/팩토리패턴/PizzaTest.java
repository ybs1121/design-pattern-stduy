package com.example.designpattern.팩토리패턴;

import com.example.designpattern.팩토리패턴.pizza.Pizza;
import com.example.designpattern.팩토리패턴.pizza.SimplePizzaFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PizzaTest {


    @Test
    void test() throws Exception{
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

        Pizza cheese = simplePizzaFactory.createPizza("cheese");

        cheese.prepare();
        cheese.bake();


    }
}
