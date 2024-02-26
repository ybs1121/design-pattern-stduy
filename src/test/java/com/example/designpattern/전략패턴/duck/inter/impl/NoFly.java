package com.example.designpattern.전략패턴.duck.inter.impl;

import com.example.designpattern.전략패턴.duck.inter.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는 날지 못하지");
    }
}
