package com.example.designpattern.커맨트패턴;

public class SpeakerCommand implements Command{

    Speaker speaker;

    public SpeakerCommand(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public void execute() {
        speaker.soundUp();
    }
}
