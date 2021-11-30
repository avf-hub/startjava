public class Cycle {
    public static void main(String[] args) {
        System.out.println("----- Цикл for -----");
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("\n----- Цикл while -----");
        int j = 6;
        while(j >= -6) {
            System.out.println(j);
            j = j - 2;
        }

        System.out.println("\n----- Цикл do while -----");
        /*
        Должны получиться суммы:
            Сумма четных = 90
            Сумма нечетных = 75
        */
        int k = 10;
        int sumEven = 0;
        int sumUneven = 0;
        do {
            if (k % 2 == 0) {
                sumEven = sumEven + k;
            } else {
                sumUneven = sumUneven + k;
            }
            k++;
        } while(k <= 20);
        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма нечетных чисел: " + sumUneven);
    }
}