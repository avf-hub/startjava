import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean active = true;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

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
        while(true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String question = scanner.next();
            if(question.equals("no")) {
                active = false;
                break;
            } else if(question.equals("yes")) {
                break;
            } else {
                System.out.println("Вы ввели недопустимый ответ!");
            }
        }
    } while (active);
    System.out.println("Программа завершена!");
}
}