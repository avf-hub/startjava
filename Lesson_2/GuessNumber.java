import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        Random random = new Random();
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.secretNumber = random.nextInt(100 + 1);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Участник " + firstPlayer.getName() + ", введите число от 0 до 100 : ");
        firstPlayer.setNumber(scanner.nextInt());
        boolean win = checkNumber(firstPlayer);
        if(!win) {
            System.out.print("Участник " + secondPlayer.getName() + ", введите число от 0 до 100 : ");
            secondPlayer.setNumber(scanner.nextInt());
            win = checkNumber(secondPlayer);
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