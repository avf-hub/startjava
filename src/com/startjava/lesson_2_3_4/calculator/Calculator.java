package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private static int number1;
    private static int number2;
    private static char mathOperation;

    public static void setNumber1(int number1) {
        Calculator.number1 = number1;
    }

    public static void setNumber2(int number2) {
        Calculator.number2 = number2;
    }

    public static void setMathOperation(char mathOperation) {
        Calculator.mathOperation = mathOperation;
    }

    public static int calculate() {
        switch(mathOperation) {
            case '+':
                return Math.addExact(number1, number2);
            case '-':
                return Math.subtractExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case '/':
                return Math.floorDiv(number1, number2);
            case '^':
                return (int) Math.pow(number1, number2);
            case '%':
                return (int) Math.IEEEremainder(number1, number2);
            default:
                return 0;
        }
    }
}