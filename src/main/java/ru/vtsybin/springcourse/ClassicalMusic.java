package ru.vtsybin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {


    private static List<String> allMusic;

   public ClassicalMusic(){
       allMusic = new ArrayList<>();
       allMusic.add("Hungarian Rhapsody 1");
       allMusic.add("Hungarian Rhapsody 2");
       allMusic.add("Hungarian Rhapsody 3");
   }

    @Override
    public List<String> getSong() {
        return allMusic;
    }
}


