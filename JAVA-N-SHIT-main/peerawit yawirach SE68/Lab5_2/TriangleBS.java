package Lab5_2;

import java.util.Scanner;

public class TriangleBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a=0;
        double b=0;
        double c=0;
        String TriangleTypes = "";

        System.out.println("Enter Length Of Side 1: ");
        a = input.nextDouble();

        System.out.println("Enter Length Of Side 2: ");
        b = input.nextDouble();

        System.out.println("Enter Length Of Side 3: ");
        c = input.nextDouble();

        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            if (a==b && b==c) {
                TriangleTypes = "Equilateral";
            }
            else if (a == b || b == c || c == a) {
                TriangleTypes = "Isosceles";
            }
            else if (a != b && b != c && c != a) {
                TriangleTypes = "Scalene";
            }

            System.out.println("The Sides Form A " + TriangleTypes + " Triangle");

        }
        else {
            System.out.println("These Sides Cannot Form a Valid Triangle.");
        }
    }
}
