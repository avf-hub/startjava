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
            j -= 2;
        }

        System.out.println("\n----- Цикл do while -----");
        /*
        Должна получиться сумма:
            Сумма нечетных = 75
        */
        int k = 10;
        int sumOdd = 0;
        do {
            if (k % 2 != 0) {
                sumOdd += k;
            }
            k++;
        } while(k <= 20);
        System.out.println("Сумма нечетных чисел: " + sumOdd);
    }
}