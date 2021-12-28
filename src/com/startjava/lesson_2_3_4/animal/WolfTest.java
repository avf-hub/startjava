package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Пол волка: " + wolf.getGender());
        System.out.println("Цвет волка: " + wolf.getColor());
        wolf.setWeight(67.4f);
        System.out.println("Вес волка: " + wolf.getWeight());
        wolf.setAge(14);
        System.out.println("Возраст волка: " + wolf.getAge());

        wolf.run();
        wolf.sit();
        wolf.go();
        wolf.howl();
        wolf.hunt();
    }
}