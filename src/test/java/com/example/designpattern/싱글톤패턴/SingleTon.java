package com.example.designpattern.싱글톤패턴;

public class SingleTon {
    private volatile static SingleTon uniqueInstance;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingleTon.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingleTon();
                }
            }
        }

        return uniqueInstance;

    }
}

