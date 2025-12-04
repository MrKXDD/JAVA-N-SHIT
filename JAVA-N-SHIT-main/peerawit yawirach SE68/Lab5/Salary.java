package Lab5;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Whours = 0;
        double HourlyWage = 8.00;
        double Paid = 0;

        System.out.println("Number of your work hours: ");
        Whours = input.nextDouble();

        if (Whours<=40) {
            Paid = Whours * HourlyWage;
        }
        else{
            HourlyWage = 12.00;
            Paid = 320 + ((Whours - 40) * HourlyWage);
        }

        System.out.println("Your paycheck are: $" + Paid);
    }
}
