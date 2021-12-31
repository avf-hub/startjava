package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

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
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumbers(int number, int index) {
        if (number > 0 && number < 100) {
            numbers[index] = number;
        }
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0);
    }
}