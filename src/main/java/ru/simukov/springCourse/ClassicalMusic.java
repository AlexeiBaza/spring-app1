package ru.simukov.springCourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {

    }

    private static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
