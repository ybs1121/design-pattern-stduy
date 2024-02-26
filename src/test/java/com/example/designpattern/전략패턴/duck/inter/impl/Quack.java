package com.example.designpattern.전략패턴.duck.inter.impl;

import com.example.designpattern.전략패턴.duck.inter.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽊꽊");
    }
}
