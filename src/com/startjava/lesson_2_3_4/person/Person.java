package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "male";
    String name = "Oks";
    float height = 1.84f;
    float weight = 78.2f;
    int age = 30;

    public void walk() {
        System.out.println("Я гуляю на улице.");
    }

    public void sit() {
        System.out.println("Я присел отдохнуть.");
    }

    public void run() {
        System.out.println("Я побежал.");
    }

    public void speak() {
        System.out.println("Я разговариваю.");
    }

    public void learnJava() {
        System.out.println("Я учу Java.");
    }
}