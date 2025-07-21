package Lab5;

import java.util.Scanner;

public class CompareTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Celcius = 0;
        double Farenhi = 0;
        String Formula = "";

        System.out.println("Choose Formula between Celcius and Fahrenheit(C or F): ");
        Formula = input.nextLine();



        if (Formula.equalsIgnoreCase("C")) {
            System.out.println("Input The Temp in Farenhi: ");
            Farenhi = input.nextDouble();            
            Celcius = (Farenhi - 32) * 5/9;

            System.out.printf("Your Calculculated Temp are: " + Celcius + "C");            
        }
        else{
            System.out.println("Input The Temp in Celcius: ");    
            Celcius = input.nextDouble();        
            Farenhi = (9 * Celcius)/5 + 32;
            System.out.printf("Your Calculculated Temp are: " + Farenhi + "F");            
        }
    }
}
