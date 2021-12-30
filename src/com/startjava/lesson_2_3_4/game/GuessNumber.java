package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
        resetNumbers();
        for (Player player : players) {
            if (checkNumber(player)) {
                break;
            }
        }
        showNumbers();
    }

    private boolean checkNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = player.getNumbers();
        for (int i = 0; i < 10; i++) {
            System.out.print("Участник " + player.getName() + ", введите число от 0 до 100 : ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер!");
            } else if (numbers[i] < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер!");
            } else {
                System.out.println("Поздравляем, Участник " + player.getName() + " угадал число " + numbers[i]
                        + " c " + (i + 1) + " попытки!");
                int[] copyArray = Arrays.copyOf(numbers, i + 1);
                player.setNumbers(copyArray);
                return true;
            }
        }
        System.out.println("У участника " + player.getName() + " закончились попытки!");
        return false;
    }

    private void showNumbers() {
        for (Player player : players) {
            if(player.getNumbers()[0] != 0) {
                System.out.println("Введенные числа игроком " + player.getName() + ": "
                        + Arrays.toString(player.getNumbers()));
            } else {
                System.out.println("До участника " + player.getName() + " не дошла очередь!");
            }
        }
    }

    private void resetNumbers() {
        for (Player player: players) {
            Arrays.fill(player.getNumbers(), 0);
        }
    }
}