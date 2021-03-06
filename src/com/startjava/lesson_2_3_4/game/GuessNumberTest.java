package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = createPlayers(scanner);
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";

        do {
            game.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
                if("yes".equals(answer) || "no".equals(answer)) {
                    break;
                } else {
                    System.out.println("Вы ввели недопустимый ответ!");
                }
            } while(true);
        } while("yes".equals(answer));
        System.out.println("Игра завершена!");
        scanner.close();
    }

    private static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Участник №" + (i + 1) + ", введите свое имя: ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}