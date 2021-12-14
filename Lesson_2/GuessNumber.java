import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber = 1;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        Random random = new Random();
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.secretNumber += random.nextInt(100);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первый Участник, введите свое имя: ");
        firstPlayer.setName(scanner.nextLine());
        System.out.print("Участник " + firstPlayer.getName() + ", введите число от 0 до 100 : ");
        firstPlayer.setNumber(scanner.nextInt());
        boolean win = checkNumber(1);

        if(!win) {
            System.out.print("Второй Участник, введите свое имя: ");
            secondPlayer.setName(scanner.next());
            System.out.print("Участник " + secondPlayer.getName() + ", введите число от 0 до 100 : ");
            secondPlayer.setNumber(scanner.nextInt());
            win = checkNumber(2);
        }
    }

    private boolean checkNumber(int numberPlayer) {
        int checkNumber = numberPlayer == 1 ? firstPlayer.getNumber() : secondPlayer.getNumber();
        String playerName = numberPlayer == 1 ? firstPlayer.getName() : secondPlayer.getName();
        if(checkNumber > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (checkNumber < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Поздравляем, Участник " + playerName + " угадал число!");
            return true;
        }
    }
}