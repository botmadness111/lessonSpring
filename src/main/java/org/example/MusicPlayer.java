package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
    ClassicalMusic classicalMusic;
    RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(TypeOfMusic typeOfMusic) {
        Random random = new Random();
        String song = "";
        if (typeOfMusic == TypeOfMusic.Rock) {
            List<String> songs = rockMusic.getSongs();
            song = songs.get(random.nextInt(3));
        } else {
            List<String> songs = classicalMusic.getSongs();
            song = songs.get(random.nextInt(3));
        }

        return song;

    }


}
