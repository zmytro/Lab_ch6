package lab_ch6_darvis;

import java.util.Random;
import java.util.Scanner;

public class Ex6_29_CoinTossing {
    private static final Random random = new Random();

    private enum Coin {
        HEADS, TAILS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hCount = 0;
        int tCount = 0;

        int option = 0;

        while (option != 3) {
            System.out.println("1 - подбросить монетку");
            System.out.println("2 - вывести результаты");
            System.out.println("3 - выход\n");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (flip() == Coin.HEADS) {
                        System.out.println("---Орел---");
                        hCount++;
                    }
                    else {
                        System.out.println("---Решка---");
                        tCount++;
                    }
                    break;
                case 2:
                    System.out.println("РЕЗУЛЬТАТ");
                    System.out.println("Орлы -> " + hCount + "\n");
                    System.out.println("Решки -> " + tCount + "\n");
                    break;
                case 3:
                    break;
            }
        }
    }
    public static Coin flip() {
        return random.nextInt(2) == 0 ? Coin.HEADS : Coin.TAILS;
    }
}
