package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        // Число введенное пользователем
        int playerNumber = 96;
        // Число сгенерированное компьютером
        int secretNumber = 14;

        do {
            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber--;
            } else if (playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber++;
            }
        } while(playerNumber != secretNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}