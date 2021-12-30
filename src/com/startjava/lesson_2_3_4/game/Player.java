package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}