package com.example.designpattern.어댑터패턴;

public class TurkeyAdapter implements Duck{
    private WildTurkey wildTurkey;
    public TurkeyAdapter(WildTurkey wildTurkey) {
        this.wildTurkey = wildTurkey;
    }
    @Override
    public void quack() {
        wildTurkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            wildTurkey.fly();
        }
    }
}
