package Lab5_2;

import java.util.Scanner;

public class CalculatorBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double FirstNum = 0;
        double SecondNum = 0;
        double Results = 0;
        boolean ValidOp = true;

        System.out.println("Enter The First Number: ");
        FirstNum = input.nextDouble();

        System.out.println("Enter an Operator (+,-,*,/): ");
        char operator = input.next().charAt(0);

        System.out.println("Enter The Second Number: ");
        SecondNum = input.nextDouble();

        if (FirstNum != 0 && SecondNum != 0) {
            if (operator == '+') {
                Results = FirstNum + SecondNum;
            } else if (operator == '-') {
                Results = FirstNum - SecondNum;
            } else if (operator == '*') {
                Results = FirstNum * SecondNum;
            } else if (operator == '/') {
                Results = FirstNum / SecondNum;
            } else {
                ValidOp = false;
            }
            if (ValidOp == true) {
                System.out.println("Reaults: " + Results);
            } else {
                System.out.println("Error: Invalid operator.");
            }
        } else {
            System.out.println("Error: Cannot Divide by Zero.");
        }
    }
}
