package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int secretNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void playGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100 + 1);
        clearNumbers();
        for (Player player : players) {
            if (playPlayer(player)) {
                break;
            }
        }
        showNumbers();
    }

    private void clearNumbers() {
        for (Player player : players) {
            player.clearNumbers();
        }
    }

    private boolean playPlayer(Player player) {
        Scanner scanner = new Scanner(System.in);
        int playerNumber = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Участник " + player.getName() + ", введите число от 0 до 100 : ");
            playerNumber = scanner.nextInt();
            player.setNumbers(playerNumber, i);
            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер!");
            } else if (playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер!");
            } else {
                System.out.println("Поздравляем, Участник " + player.getName() + " угадал число " + playerNumber
                        + " c " + (i + 1) + " попытки!");
                return true;
            }
        }
        System.out.println("У участника " + player.getName() + " закончились попытки!");
        return false;
    }

    private void showNumbers() {
        for (Player player : players) {
            if(player.getNumbers()[0] != 0) {
                System.out.print("Введенные числа игроком " + player.getName() + ": { ");
                for (int number : player.getNumbers()) {
                    if (number != 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println("}");
            } else {
                System.out.println("До участника " + player.getName() + " не дошла очередь!");
            }
        }
    }
}