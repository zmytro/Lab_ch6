package lab_ch6_darvis;

import java.util.Random;
import java.util.Scanner;

public class Ex6_30_GuessTheNumber {
    private static final Random random = new Random();
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        boolean flag = true;
        int count = 0;
        int num = random.nextInt(1000);
        System.out.println("Угадайте число от 1 до 1000");
        while (flag) {
            System.out.print("Введите число: ");
            count++;
            int guess = sc.nextInt();
            if(guess == num){
                System.out.println("Поздравляю,вы угадали число!");
                flag=false;

            }

            if(guess > num){
                System.out.println("Много. Попробуйте еще раз...\n");
            }if(guess < num) {
                System.out.println("Мало. Попробуйте еще раз...\n");
            }
        }
        if(count <= 10){
            System.out.println("Либо вы знаете секрет,либо вам повезло!");
        }
        if(count == 10){
            System.out.println("Ага,ты знаешь секрет!");
        }
        if (count > 10){
            System.out.println("Ты должен лучше стараться и у тебя получится угадать с 10 попытки!");
        }
    }
}
