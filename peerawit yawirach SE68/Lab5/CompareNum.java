package Lab5;

import java.util.Scanner;

public class CompareNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double FirstNum = 0;
        double SecondNum = 0;

        System.out.println("Input First Number: ");
        FirstNum = input.nextDouble();

        System.out.println("Input Second Number: ");
        SecondNum = input.nextDouble();

        if (FirstNum<SecondNum) {
            System.out.println("The first number is no greater than the second");
        }
        else if (SecondNum<FirstNum) {
            System.out.println("The first number is greater than the second");
        }
        else{
            System.out.println("These two number are equal");
        }
    }
}
