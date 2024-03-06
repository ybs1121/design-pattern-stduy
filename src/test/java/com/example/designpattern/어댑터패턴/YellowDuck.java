package com.example.designpattern.어댑터패턴;




public class YellowDuck implements Duck {


    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("long fly");
    }
}
