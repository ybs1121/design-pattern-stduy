package com.example.designpattern.전략패턴.duck;

import com.example.designpattern.전략패턴.duck.inter.impl.FlyWithWings;
import com.example.designpattern.전략패턴.duck.inter.impl.Quack;

public class YellowDuck extends Duck{

    public YellowDuck (){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

}
