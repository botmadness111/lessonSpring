package org.example;

import java.util.List;

public class MusicPlayer {
    private List<Music> musics;

    private String name;
    private int volume;

    //IoC
    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void playMusic() {
        for (Music music : musics) {
            System.out.println(music.getSong());
        }
    }
}
