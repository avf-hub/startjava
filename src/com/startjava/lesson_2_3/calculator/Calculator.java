package com.startjava.lesson_2_3.calculator;

public class Calculator {
    
    private int number1;
    private int number2;
    private char mathOperation;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        switch(mathOperation) {
            case '+':
                System.out.println("Результат вычисления: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Результат вычисления: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Результат вычисления: " + (number1 * number2));
                break;
            case '/':
                System.out.println("Результат вычисления: " + (number1 / number2));
                break;
            case '^':
                pow();
                break;
            case '%':
                System.out.println("Результат вычисления: " + (number1 % number2));
                break;
            default:
                System.out.println("Ошибка!");
        }
    }

    private void pow() {
        int result = 1;
        for(int i = 0; i < number2; i++) {
            result *= number1;
        }
        System.out.println("Результат вычисления: " + result);
    }
}