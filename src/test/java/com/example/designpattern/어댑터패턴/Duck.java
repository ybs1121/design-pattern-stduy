package com.example.designpattern.어댑터패턴;

import com.example.designpattern.전략패턴.duck.inter.FlyBehavior;
import com.example.designpattern.전략패턴.duck.inter.QuackBehavior;

public interface Duck {

    void quack();

    void fly();
}
