public class MyFirstGame {
    public static void main(String[] args) {
        // Число введенное пользователем
        int numberUser = 96;
        // Число сгенерированное компьютером
        int numberComputer = 14;

        do {
            if (numberUser > numberComputer) {
                System.out.println("Данное число больше того, что загадал компьютер");
                numberUser--;
            } else if (numberUser < numberComputer) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                numberUser++;
            } else {
                System.out.println("Поздравляю, число угадано!");
                break;
            }
        } while(true);
    }
}