package lab_ch6_darvis;

public class Ex6_15_HypotenuseCalculations {
    public static void main(String[] args){
        double [][] TriangleSides = {{3.0, 4.0}, {5.0, 12.0}, {8.0, 15.0}};
        int count = 1;
            for (int i = 0; i < 3; i++) {
                System.out.println("Треугольник " + count);
                count++;
                for (int j = 0; j < 2; j++) {
                    System.out.printf("сторона 1: %.2f\nсторона 2: %.2f\nгипотенуза: %.2f\n",
                    TriangleSides[i][j], TriangleSides[i][j+1], hypotenuse(TriangleSides[i][j],TriangleSides[i][j+1]));
                    System.out.println("asdasdas");

                    break;
                }
            }
    }
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

    }
}
