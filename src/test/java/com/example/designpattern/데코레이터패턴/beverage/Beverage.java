package com.example.designpattern.데코레이터패턴.beverage;

public abstract class Beverage {
    String description = "Nothing";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
