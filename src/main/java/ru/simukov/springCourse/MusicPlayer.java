package ru.simukov.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music;


    private List<Music> musicList = new ArrayList<>();
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public MusicPlayer() {}
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    //IOC (inversion of control)

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
