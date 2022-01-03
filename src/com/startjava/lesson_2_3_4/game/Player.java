package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int index;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, index + 1);
    }

    public void setNumber(int number) {
        if (number > 0 && number <= 100) {
            numbers[index] = number;
        }
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, index + 1, 0);
    }

    public void setIndex(int index) {
        this.index = index;
    }
}