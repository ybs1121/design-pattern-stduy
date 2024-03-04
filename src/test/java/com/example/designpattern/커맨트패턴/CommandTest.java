package com.example.designpattern.커맨트패턴;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommandTest {

    @Test
    void test() {
        RemoteController remoteController = new RemoteController();

        Command tvCommand = new TvCommand(new Tv());

        remoteController.setCommand(tvCommand);
        remoteController.run();

        remoteController.setCommand(new SpeakerCommand(new Speaker()));
        remoteController.run();


    }
}
