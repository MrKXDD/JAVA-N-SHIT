package Lab3;

import java.util.Scanner;

//----------Lab 3
//----------(Student name and Id.)
//This program for calculate the area of regtangle
public class Regtangle {
    public static void main(String[] args) {
        float length;
        float width;
        float area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length:");
        length = input.nextFloat();
        System.out.print("Enter width:");
        width = input.nextFloat();
        area = length * width;
        System.out.println("The area of regtangle is " + area);
    }
}
