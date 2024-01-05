package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music1 = context.getBean("classicalMusic", Music.class);
        Music music2 = context.getBean("rockMusic", Music.class);
        Music music3 = context.getBean("jazzMusic", Music.class);

        System.out.println(music1.getClass());
        System.out.println(music2.getClass());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.setMusics(new ArrayList<>(Arrays.asList(music1, music2, music3)));

        musicPlayer.playMusic();

        context.close();
    }
}
