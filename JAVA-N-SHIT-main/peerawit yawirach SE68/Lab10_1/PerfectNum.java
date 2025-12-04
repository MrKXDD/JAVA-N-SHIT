package Lab10_1;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean results;
        int insert = 0;
        System.out.print("The Number You Wanna Check: ");
        insert = input.nextInt();
        results = isPerfect(insert);
        if (results == true) {
            System.out.println(insert + " is a perfect number.");
        }else{
            System.out.println(insert + " is not a perfect number.");
        }
    }
    public static Boolean isPerfect(int number) {
        int sumOfDivisors = 0;
        boolean perfect;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sumOfDivisors += i; 
            }
        }
        if (sumOfDivisors == number) {
            perfect = true;
        } else {
            perfect = false;
        }
        return perfect;
    }
}