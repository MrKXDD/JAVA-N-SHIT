package Lab6_2;

import java.util.Scanner;

public class CmdCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Fnum = 0, Snum = 0, result = 0;

        System.out.println("Please enter First Number: ");
        Fnum = input.nextDouble();
        System.out.println("Operator?[+,-,*,/]: ");
        char operator = input.next().charAt(0);
        System.out.println("Please enter Second Number: ");
        Snum = input.nextDouble();

        switch (operator) {
            case '+':
                result = Fnum + Snum;
                System.out.println("Results: " + result);
                break;
            case '-':
                result = Fnum - Snum;
                System.out.println("Results: " + result);
                break;
            case '*':
                result = Fnum * Snum;
                System.out.println("Results: " + result);
                break;
            case '/':
                result = Fnum / Snum;
                if (Snum == 0) {
                    System.out.println("Error: Cannot Division by Zero");
                } else {
                    System.out.println("Results: " + result);
                }
                break;
        }
    }
}
