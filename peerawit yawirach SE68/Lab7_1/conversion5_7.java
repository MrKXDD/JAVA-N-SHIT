package Lab7_1;

import java.util.Scanner;

public class conversion5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxnum, count = 0, i = 0;

        System.out.print("Enter number: ");
        maxnum = input.nextInt();

        while (i <= maxnum) {
            i++;
            if ((i % 5 == 0 || i % 7 == 0) && !(i % 5 == 0 && i % 7 == 0)) {
                count++;
                System.out.print(" " + i);
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
