package ru.simukov.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(//обращается к applicationContext.xml, считывает его и помещает все бины в applicationContext
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer1 = context.getBean("MusicBeanList", MusicPlayer.class);
        musicPlayer1.playMusicList();
        context.close();
    }
}
