package Lab7_2;

import java.util.Scanner;

public class DecimalBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Binar = "", Raw = "";
        int i = -1, solved = 0, power = 0;
        char x = 0;
        System.out.println("Please Enter Binary Number: ");
        Raw = input.nextLine();
        if (Raw.charAt(0) == '0') {
            System.out.print("Decimal: 0");
        } else {
            i += Raw.length();
            while (i > -1) {
                x = Raw.charAt(i);
                if (x == '1') {
                    solved += Math.pow(2, power);
                }
                i--;
                power++;

            }
            System.out.println(solved);
        }

    }
}
