package Lab10_1;

import java.util.Scanner;

import Lab6_2.Calculator;

public class CalcOverload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length=0,width=0,radius=0;
        int side=0;
        CalcOverload calc = new CalcOverload();

        System.out.print("Area of square with side ");
        side = input.nextInt();
        System.out.println(": " + calc.calculateArea(side));
        System.out.print("Area of rectangle with Length ");
        length = input.nextDouble();
        System.out.print(" and width ");
        width = input.nextDouble();
        System.out.println(": " + calc.calculateArea(length,width));
        System.out.print("Area of circle with radius ");
        radius = input.nextDouble();
        System.out.println(": " + calc.calculateArea(radius));
    }
    public static int calculateArea(int num) {
        int result =0;
        result = (int)Math.pow(num, 2);
        return result;
    }
    public static double calculateArea(double length, double width) {
        double result =0;
        result = length*width;
        return result;
    }
    public static double calculateArea(double radius) {
        double result =0;
        result = Math.PI*Math.pow(radius,2);
        return result;
    }
}
