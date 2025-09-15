package Lab8_2.Lab9_1;

import java.util.Scanner;

public class DistanceBS {
    public static void main(String[] args) {
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Coordinate X axis: ");
        x1 = input.nextDouble();
        System.out.println("Enter First Coordinate Y axis: ");
        y1 = input.nextDouble();
        System.out.println("Enter Second Coordinate X axis: ");
        x2 = input.nextDouble();
        System.out.println("Enter Second Coordinate Y axis: ");
        y2 = input.nextDouble();
        result = distance(x1, y1, x2, y2);
        System.out.println("The Distances Between These Two Points is: " + result);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y2 - y1), 2));
        return result;
    }
}
