package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "да";

        System.out.println("Калькулятор запущен!\n");

        do {
            System.out.print("Введите математическое выражение: ");
            System.out.println("Результат вычисления: " + Calculator.calculate(scanner.nextLine()));
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                answer = scanner.next();
                if("да".equals(answer) || "нет".equals(answer)) {
                    break;
                }
                System.out.println("Вы ввели недопустимый ответ!");
            } while(true);
        } while ("да".equals(answer));
        System.out.println("\nКалькулятор закрылся!");
        scanner.close();
    }
}