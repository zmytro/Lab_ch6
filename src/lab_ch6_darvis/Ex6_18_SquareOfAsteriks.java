package lab_ch6_darvis;

import java.util.Scanner;

public class Ex6_18_SquareOfAsteriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sides = 0;
        while(sides == 0 || sides > 50){
            System.out.print("Введите число от 1 до 50: ");
            int user_input = sc.nextInt();

            if(user_input > 0 && user_input <= 50)
                sides = user_input;
        }
        squareOfAsterisks(sides);
    }

    public static void squareOfAsterisks(int sides) {

        String Asteriks = "*";
        String Space = " ";

        for (int i = 0; i < sides; i++) {

            for (int j = 0; j < sides; j++)

                if (i == 0 || j == 0 || i == sides - 1 || j == sides - 1)
                    System.out.print(Asteriks + Space);
                else
                    System.out.print(Space + Space);

            System.out.println();
        }
    }
}
