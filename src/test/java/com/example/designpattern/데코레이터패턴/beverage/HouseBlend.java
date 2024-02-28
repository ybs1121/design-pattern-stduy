package com.example.designpattern.데코레이터패턴.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        this.description = "하우스 블렌드";
    }
    @Override
    public double cost() {
        return .89;
    }
}
