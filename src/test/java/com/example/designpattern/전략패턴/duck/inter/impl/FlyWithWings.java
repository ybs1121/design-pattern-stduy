package com.example.designpattern.전략패턴.duck.inter.impl;

import com.example.designpattern.전략패턴.duck.inter.FlyBehavior;


public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날아올라");
    }

    public FlyWithWings(){};
}
