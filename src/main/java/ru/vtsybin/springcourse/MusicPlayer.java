package ru.vtsybin.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    private Music music;

    private List<Music> musicList;

    private String name;
    private int volue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolue() {
        return volue;
    }

    public void setVolue(int volue) {
        this.volue = volue;
    }





    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){

        for(int i=0; musicList.size() > i; i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }

    public MusicPlayer(){}
}
