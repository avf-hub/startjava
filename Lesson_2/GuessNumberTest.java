import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        // Число сгенерированное компьютером
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        System.out.println("Число компьютера: " + secretNumber);
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        System.out.print("Первый Участник, введите свое имя: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Второй Участник, введите свое имя: ");
        Player secondPlayer = new Player(scanner.nextLine());

        do {
            // First player
            System.out.print("Участник " + firstPlayer.getName() + ", введите число от 0 до 100 : ");
            int numberFirstPlayer = scanner.nextInt();
            firstPlayer.setNumber(numberFirstPlayer);

            // Second player
            System.out.print("Участник " + secondPlayer.getName() + ", введите число от 0 до 100 : ");
            int numberSecondPlayer = scanner.nextInt();
            secondPlayer.setNumber(numberSecondPlayer);

            // Play game
            GuessNumber game = new GuessNumber(firstPlayer, secondPlayer, secretNumber);
            switch(game.playFirstPlayer()) {
                case '>' :
                    System.out.println("Участник " + firstPlayer.getName() + " ввел число больше того, что загадал компьютер");
                    break;
                case '<' :
                    System.out.println("Участник " + firstPlayer.getName() + " ввел число меньше того, что загадал компьютер");
                    break;
                case '=' :
                    System.out.println("Поздравляем, Участник " + firstPlayer.getName() + " угадал число!");
                    break;
                default:
                    System.out.println("Вы ввели недопустимые данные!");
            }

            switch(game.playSecondPlayer()) {
                case '>' :
                    System.out.println("Участник " + secondPlayer.getName() + " ввел число больше того, что загадал компьютер");
                    break;
                case '<' :
                    System.out.println("Участник " + secondPlayer.getName() + " ввел число меньше того, что загадал компьютер");
                    break;
                case '=' :
                    System.out.println("Поздравляем, Участник " + secondPlayer.getName() + " угадал число!");
                    break;
                default:
                    System.out.println("Вы ввели недопустимые данные!");
            }

            // Question to the user
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if("yes".equals(answer) || "no".equals(answer)) {
                    break;
                } else {
                    System.out.println("Вы ввели недопустимый ответ!");
                }
            } while(true);
        } while("yes".equals(answer));
        System.out.println("Программа завершена!");
        scanner.close();
    }
}