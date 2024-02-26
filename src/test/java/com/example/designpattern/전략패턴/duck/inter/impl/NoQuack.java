package com.example.designpattern.전략패턴.duck.inter.impl;

import com.example.designpattern.전략패턴.duck.inter.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("나는 꽉 못하지");
    }
}
