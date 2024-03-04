package com.example.designpattern.커맨트패턴;


public class TvCommand implements Command {
    Tv tv;

    public TvCommand(Tv tv) {
        this.tv  = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}
