package ru.vtsybin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {

        Random r = new Random();
        int randomSongIndex = r.nextInt((2 - 0) + 1) + 0;

        if (genre == Genre.CLASSICAL){
            return music2.getSong().get(randomSongIndex);
         }
         else if(genre == Genre.ROCK){
            return music1.getSong().get(randomSongIndex);
        }

        return "нет такого жанра";
    }
}
