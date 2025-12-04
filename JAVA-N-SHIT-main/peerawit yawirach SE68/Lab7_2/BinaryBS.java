package Lab7_2;

import java.util.Scanner;

public class BinaryBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, bina = 0;
        String Binar = " ";
        System.out.println("Please Enter Decimal Number: ");
        num = input.nextInt();
        if (num == 0) {
            System.out.print("Binary: 0");
        } else {
            while (num != 0) {
                bina = num % 2;
                Binar = bina + Binar;
                num /= 2;
            }
            System.out.println("Binary: " + Binar);
        }

    }
}
