package lab_ch6_darvis;
import java.util.Scanner;
public class Ex6_20_CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        double radius = sc.nextDouble();
        System.out.printf("Площадь окружности равна - %.2f\n",circleArea(radius));
    }
    public static double circleArea(double r)
    {
        return Math.PI*Math.pow(r,2);
    }
}
