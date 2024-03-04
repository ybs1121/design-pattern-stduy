package com.example.designpattern.팩토리패턴.pizza;

public abstract class Pizza {

    String pizzaName = "없음";
    String dough;
    String sauce;

    public void prepare(){

        System.out.println(pizzaName + " 준비");
    }
    public void bake(){
        System.out.println("굽기");
    }
    public void cut(){
        System.out.println("자르기");
    }
    public void box(){
        System.out.println("포장");
    }
}
