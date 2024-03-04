package com.example.designpattern.팩토리패턴.pizza;

public class SimplePizzaFactory {


    public Pizza createPizza(String kind) throws ClassNotFoundException {
        if(kind.equals("cheese")) {
            return new CheesePizza();
        } else if (kind.equals("combination")) {
            return new CombinationPizza();
        } else {
            throw new ClassNotFoundException("피자를 찾을수 없다");
        }
    }
}
