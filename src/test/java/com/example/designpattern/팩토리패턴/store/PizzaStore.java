package com.example.designpattern.팩토리패턴.store;

import com.example.designpattern.팩토리패턴.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) throws ClassNotFoundException {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();


        return pizza;

    }

    abstract Pizza createPizza(String type) throws ClassNotFoundException;
}
