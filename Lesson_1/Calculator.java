public class Calculator {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        int result = 1;
        char token = '^';

        if (token == '+') {
            result = number1 + number2;
        } else if (token == '-') {
            result = number1 - number2;
        } else if (token == '*') {
            result = result * number2;
        } else if (token == '/') {
            result = number1 / number2;
        } else if (token == '^') {
            for(int i = 1; i <= number2; i++) {
                result = result * number1;
            }
        } else if (token == '%') {
            result = number1 % number2;
        } else {
            result = 0;
            System.out.println("Вы ввели не верный арифметический знак!");
        }

        System.out.println("Результат вычисления: " + result);
    }
}