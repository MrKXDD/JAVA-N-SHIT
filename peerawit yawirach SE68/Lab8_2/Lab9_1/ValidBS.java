package Lab8_2.Lab9_1;

import java.util.Scanner;

public class ValidBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1=0,side2=0,side3=0;
        String TriangleType="";
        System.out.println("Enter The Length Of Side 1: ");
        side1 = input.nextDouble();
        System.out.println("Enter The Length Of Side 2: ");
        side2 = input.nextDouble();
        System.out.println("Enter The Length Of Side 3: ");
        side3 = input.nextDouble();
        TriangleType = classifyTriangle(side1, side2, side3);
        System.out.println(TriangleType);
    }

    public static String classifyTriangle(double a, double b, double c) {
        String result="";
        if ((a+b)>c&&(a+c)>b&&(b+c)>a) {
            if (a==b&&b==c&&a==c) {
                result = "The sides form a Equilateral";
            }
            else if(a==b||b==c||a==c){
                result = "The sides form a Isosceles";
            }
            else{
                result = "The sides form a Scalene";
            }
        }else{
            result = ("These sides form an Invalid Triangle Inequality Theorem");
        }
        return result;
    }
}
