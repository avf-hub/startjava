package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int secretNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void play() {
        Random random = new Random();
        secretNumber = random.nextInt(100 + 1);
        System.out.println("\nИгра началась!!!");
        System.out.println("У каждого участника по 10 попыток.");
        clearNumbers();
        for (int i = 0; i < 10; i++) {
            if (startRound(i)) {
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

    private boolean startRound(int i) {
        Scanner scanner = new Scanner(System.in);
        int playerNumber = 0;
        for (Player player : players) {
            System.out.print("Участник " + player.getName() + ", введите число от 0 до 100 : ");
            playerNumber = scanner.nextInt();
            player.setIndex(i);
            player.setNumber(playerNumber);
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
        return false;
    }

    private void showNumbers() {
        for (Player player : players) {
            System.out.print("Введенные числа игроком " + player.getName() + ": { ");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
                System.out.println("}");
        }
    }
}