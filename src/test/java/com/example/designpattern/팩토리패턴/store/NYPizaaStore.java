package com.example.designpattern.팩토리패턴.store;

import com.example.designpattern.팩토리패턴.pizza.*;

public class NYPizaaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) throws ClassNotFoundException {
        if(type.equals("NYcheese")) {
            return new NYCheesePizza();
        } else if (type.equals("NYcombination")) {
            return new NYCombinationPizza();
        } else {
            throw new ClassNotFoundException("피자를 찾을수 없다");
        }
    }
}
