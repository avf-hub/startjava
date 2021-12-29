package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private static int number1;
    private static int number2;
    private static char mathOperation;

    public static int calculate(String mathExpression) {
        String[] mathOperations = mathExpression.split(" ");
        number1 = Integer.parseInt(mathOperations[0]);
        number2 = Integer.parseInt(mathOperations[2]);
        mathOperation = mathOperations[1].charAt(0);
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