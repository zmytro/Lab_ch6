package lab_ch6_darvis;
import java.util.Scanner;
public class Ex6_16_Multiples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int num1 = sc.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = sc.nextInt();
        if(isMultiple(num1, num2) == true) System.out.println(num1+" кратно "+num2);
        else System.out.println(num1+" не кратно "+num2);
    }

    public static boolean isMultiple(int num1, int num2) {
        return num1 % num2 == 0 ? true : false;
    }
}
