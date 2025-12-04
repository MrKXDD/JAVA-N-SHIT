package Lab7_1;

import java.util.Scanner;

public class Whilecalc {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        double answer = 0;
        int x, y, menu = 0;
        while (menu != 5) {
            System.out.println("Please select the operator 1.plus 2.subtract 3.multiply 4.division 5.exit");
            System.out.print("Enter:");
            menu = input.nextInt();
            if (menu == 5) {
                System.out.println("Thank you for using me");
            } else {
                System.out.println("Enter the first num");
                x = input.nextInt();
                System.out.println("Enter the second num");
                y = input.nextInt();
                switch (menu) {
                    case 1:
                        answer = x + y;
                        System.out.println("Answer is " + answer);
                        break;
                    case 2:
                        answer = x - y;
                        System.out.println("Answer is " + answer);
                        break;
                    case 3:
                        answer = x * y;
                        System.out.println("Answer is " + answer);
                        break;
                    case 4:
                        answer = x / y;
                        System.out.println("Answer is " + answer);
                        break;
                    default:
                        System.out.println("You put invalid choice");
                        break;
                }
            }
        }
    }
}
