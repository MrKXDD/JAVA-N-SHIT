import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {
        String name;
        double workhour;
        double hourlypayrate;
        double FedTax;
        double StateTax;
        double GrossPay;
        double NetPay;

        Scanner input = new Scanner(System.in);

        System.out.println("Input Name: ");
        name = input.next();

        System.out.println("How many hours did you work?: ");
        workhour = input.nextDouble();

        System.out.println("How much did you get paid?: ");
        hourlypayrate = input.nextDouble();

        System.out.println("Federal Tax Rate: ");
        FedTax = input.nextDouble();

        System.out.println("State Tax Rate: ");
        StateTax = input.nextDouble();

        GrossPay = workhour * hourlypayrate;
        double FedReduce = GrossPay * (FedTax * 0.01);
        double StateReduce = GrossPay * (StateTax * 0.01);
        double Deduction = FedReduce + StateReduce;
        NetPay = GrossPay - Deduction;

        System.out.println("Employee's name: " + name);
        System.out.println("Hours work: " + workhour);
        System.out.println("Pay Rate: $" + hourlypayrate);
        System.out.println("Gross Pay: $" + GrossPay);
        System.out.println("Deductions: ");
        System.out.println("    Federal withholding(" + FedTax + "%): $" + FedReduce);
        System.out.println("    State withholding(" + StateTax + "%): $" + StateReduce);
        System.out.println("    Total Deduction: $" + Deduction);
        System.out.println("Net pay: $" + NetPay);
    }
}
