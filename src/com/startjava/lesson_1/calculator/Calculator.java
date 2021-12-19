package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        int result = 0;
        char sign = '^';

        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = result * number2;
        } else if (sign == '/') {
            result = number1 / number2;
        } else if (sign == '^') {
            result = 1;
            for(int i = 1; i <= number2; i++) {
                result *= number1;
            }
        } else if (sign == '%') {
            result = number1 % number2;
        } else {
            System.out.println("Вы ввели не верный арифметический знак!");
        }

        System.out.println("Результат вычисления: " + result);
    }
}