package ru.vtsybin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class RockMusic implements Music{

    private static List<String> allMusic;

    private RockMusic(){
        allMusic = new ArrayList<>();
        allMusic.add("Wind cries Mary 1");
        allMusic.add("Wind cries Mary 2");
        allMusic.add("Wind cries Mary 3");
    }


    @Override
    public List<String> getSong() {
        return allMusic;
    }
}
