package Lab3;

import java.util.Scanner;

public class Cylinder {
        public static void main(String[] args) {
        double pie = 3.1428;

        double length;
        double radius;
        double area;
        double volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length:");
        length = input.nextDouble();
        System.out.print("Enter Radius");
        radius = input.nextDouble();
        area = radius * radius * pie;
        volume = area * length;
        System.out.println("Your cylinder area is: " + area);
        System.out.println("Your cylinder volumw is: " + volume);
    }
}
