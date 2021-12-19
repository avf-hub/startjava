package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первый Участник, введите свое имя: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Второй Участник, введите свое имя: ");
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String answer = "";

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
        System.out.println("Программа завершена!");
        scanner.close();
    }
}