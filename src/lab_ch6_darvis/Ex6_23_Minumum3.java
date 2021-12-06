package lab_ch6_darvis;
import java.util.Scanner;
public class Ex6_23_Minumum3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите 3 числа");
            System.out.println("Введите 1 число");
            double num1 = sc.nextDouble();
            System.out.println("Введите 2 число");
            double num2 = sc.nextDouble();
            System.out.println("Введите 3 число");
            double num3 = sc.nextDouble();
            System.out.println("Минимальное число - " + minumum3(num1,num2,num3));
        }
        public static double minumum3(double num1, double num2, double num3){
            return Math.min(num1, Math.min(num2, num3));
        }
    }
