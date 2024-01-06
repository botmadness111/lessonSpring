package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${name}")
    String name;
    @Value("${volume}")
    int value;

    ClassicalMusic classicalMusic;
    RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getMusic(){
        return classicalMusic.getSong();
    }


    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
