import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        Player firstPlayer = new Player();
        Player secondPlayer = new Player();
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        do {
            game.play();
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