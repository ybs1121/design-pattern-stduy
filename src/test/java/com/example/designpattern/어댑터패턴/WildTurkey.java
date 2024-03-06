package com.example.designpattern.어댑터패턴;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("short fly");
    }
}
