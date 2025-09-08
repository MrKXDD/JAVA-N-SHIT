package Lab8_1;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int mode = 0;
        System.out.println("Odd or Even sum? [1:odd 2:even]: ");
        mode = input.nextInt();
        if (mode == 1) {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }

            }
            System.out.println("The sum of odd numbers from 1 to 100 is: " + sum);
        } else {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("The sum of even from 1 to 100 is: " + sum);
        }

    }
}