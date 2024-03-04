package com.example.designpattern.커맨트패턴;

public class RemoteController {
    Command command;

    public RemoteController(Command command){
        this.command = command;
    }

    public RemoteController(){

    }


    public void setCommand(Command command) {
        this.command = command;
    }
    public void run () {
        command.execute();
    }
}
