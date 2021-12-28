package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "да";

        System.out.println("Калькулятор запущен!\n");

        do {
            System.out.print("Введите математическое выражение: ");
            String mathOperation = scanner.nextLine();
            String[] mathOperations = mathOperation.split(" ");
            Calculator.setNumber1(Integer.parseInt(mathOperations[0]));
            Calculator.setNumber2(Integer.parseInt(mathOperations[2]));
            Calculator.setMathOperation(mathOperations[1].charAt(0));
            System.out.println("Результат вычисления: " + Calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                answer = scanner.next();
                if("да".equals(answer) || "нет".equals(answer)) {
                    break;
                } else {
                    System.out.println("Вы ввели недопустимый ответ!");
                }
            } while(true);
        } while ("да".equals(answer));
        System.out.println("Калькулятор закрылся!");
        scanner.close();
    }
}