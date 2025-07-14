import java.util.Scanner;
public class Invest {
    public static void main(String[] args) {
        
        double InitialAmount;
        double EstimatedValue;
        double AnnualInterest;
        double NumofYear;

        Scanner input = new Scanner(System.in);
        System.out.println("Your Initial Investment: ");
        InitialAmount = input.nextDouble();

        System.out.println("Your Annual Interest: ");
        AnnualInterest = input.nextDouble();

        System.out.println("How many Year You'll Invest: ");
        NumofYear = input.nextDouble();

        AnnualInterest = AnnualInterest*0.01;
        EstimatedValue = InitialAmount * Math.pow((1 + AnnualInterest), NumofYear);

        System.out.println("Estimated Value: " + EstimatedValue);
    }
}
