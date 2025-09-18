package Lab9_1;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double result = 0, c = 0, f = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Convert from C to F [f] or F to C [c]: ");
        String mode = input.next();
        if (mode.equalsIgnoreCase("c")) {
            System.out.print("How's the Temp?[in farenheight]: ");
            f = input.nextDouble();
            result = F2C(f);
            System.out.println("Your Temp is: " + result + " celcius");
        } else if (mode.equalsIgnoreCase("f")) {
            System.out.print("How's the Temp?[in celcius]: ");
            c = input.nextDouble();
            result = C2F(c);
            System.out.println("Your Temp is: " + result + " farenheight");
        } else {
            System.out.println("Bro. i said C or F.");
        }
    }

    public static double F2C(double F) {
        double result;
        result = (F - 32) * 5 / 9;
        return result;
    }

    public static double C2F(double C) {
        double result;
        result = (9 * C) / 5 + 32;
        return result;
    }
}
