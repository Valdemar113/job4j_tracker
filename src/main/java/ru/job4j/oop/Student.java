package ru.job4j.oop;

public class Student {

    public void music(String lyrics) {
        System.out.println("I can song a sing :" + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, i can fly";
        petya.music(song);
    }
}
