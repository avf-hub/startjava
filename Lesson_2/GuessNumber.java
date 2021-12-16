import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        secretNumber = random.nextInt(100 + 1);
        while(true) {
            System.out.print("Участник " + firstPlayer.getName() + ", введите число от 0 до 100 : ");
            firstPlayer.setNumber(scanner.nextInt());
            if(checkNumber(firstPlayer)) {
                break;
            }
            System.out.print("Участник " + secondPlayer.getName() + ", введите число от 0 до 100 : ");
            secondPlayer.setNumber(scanner.nextInt());
            if (checkNumber(secondPlayer)) {
                break;
            }
        }
    }

    private boolean checkNumber(Player player) {
        if(player.getNumber() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляем, Участник " + player.getName() + " угадал число!");
            return true;
        }
        return false;
    }
}