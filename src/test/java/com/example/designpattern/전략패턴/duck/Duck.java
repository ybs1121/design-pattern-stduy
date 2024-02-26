package com.example.designpattern.전략패턴.duck;

import com.example.designpattern.전략패턴.duck.inter.FlyBehavior;
import com.example.designpattern.전략패턴.duck.inter.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;



    public void performFly () {
        flyBehavior.fly();
    }


    public void performQuack () {
        quackBehavior.quack();
    }
}
