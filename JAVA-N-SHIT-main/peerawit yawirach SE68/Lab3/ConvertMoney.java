package Lab3;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double length;
        double conversion;
        double THB;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USD:");
        length = input.nextDouble();
        conversion = 31.8245;
        THB = length * conversion;
        System.out.println("Your Conversion is " + THB + " THB");
    }
}
