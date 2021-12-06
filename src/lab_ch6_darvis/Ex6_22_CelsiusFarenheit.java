package lab_ch6_darvis;
import java.util.Scanner;
public class Ex6_22_CelsiusFarenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag!=false) {
            System.out.println("1 - перевести C -> F");
            System.out.println("2 - перевести F -> C");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Введите значение температуры: ");
                double temp = sc.nextDouble();
                System.out.println(farenheit(temp) + "F");
                flag = false;
            }
            if (choice == 2) {
                System.out.print("Введите значение температуры: ");
                double temp = sc.nextDouble();
                System.out.println(celsius(temp) + "C");
                flag = false;
            }
            if (choice != 1 && choice != 2) {
                System.err.println("ОШИБКА");
            }
        }
    }

    private static double celsius(double farenheit){
        return 5.0 / 9.0 * (farenheit - 32);
    }
    private static double farenheit(double celsius){
        return 9.0 / 5.0 * celsius + 32;
    }
}
