import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        do {
            System.out.print("Введите первое число: ");
            int numberOne = scanner.nextInt();
            calculator.setNumber1(numberOne);
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calculator.setSign(sign);
            System.out.print("Введите второе число: ");
            int numberTwo = scanner.nextInt();
            calculator.setNumber2(numberTwo);
            System.out.println("Результат вычисления: " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if("yes".equals(answer) || "no".equals(answer)) {
                    break;
                } else {
                    System.out.println("Вы ввели недопустимый ответ!");
                }
            } while(true);
        } while ("yes".equals(answer));
        System.out.println("Программа завершена!");
        scanner.close();
    }
}