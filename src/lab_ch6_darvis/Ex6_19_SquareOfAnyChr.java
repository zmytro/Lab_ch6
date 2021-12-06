package lab_ch6_darvis;

import java.util.Scanner;

public class Ex6_19_SquareOfAnyChr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sides = 0;
        while(sides == 0 || sides > 50){
            System.out.print("Введите число от 1 до 50: ");
            int input = sc.nextInt();

            if(input > 0 && input <= 50)
                sides = input;
        }

        System.out.print("Введите 1 любой символ: ");
        char fill = sc.next().charAt(0);

        squareOfAsterisks(sides,fill);
    }

    public static void squareOfAsterisks(int sides, char fill ) {

        char chars = fill;
        String Space = " ";

        for (int i = 0; i < sides; i++) {

            for (int j = 0; j < sides; j++)

                if (i == 0 || j == 0 || i == sides - 1 || j == sides - 1)
                    System.out.print(chars + Space);
                else
                    System.out.print(Space + Space);

            System.out.println();
        }
    }
}
