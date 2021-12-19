import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "да";

        System.out.println("Калькулятор запущен!\n");

        do {
            System.out.print("Введите первое число: ");
            int numberOne = scanner.nextInt();
            calculator.setNumber1(numberOne);
            System.out.print("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            calculator.setMathOperation(mathOperation);
            System.out.print("Введите второе число: ");
            int numberTwo = scanner.nextInt();
            calculator.setNumber2(numberTwo);
            calculator.calculate();
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