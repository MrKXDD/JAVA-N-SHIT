package Lab11_1;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        double min = 0, max = 0;
        System.out.print("Enter the numbers: ");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        min = max;
        for (int i = n-1; i >= 0; i--) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        System.out.print("All them numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.err.println();
        System.out.println("Average is: " + average);
        System.out.println("number of elements above the average is: " + count);
        System.out.println("min is: " + min);
        System.out.println("mx is: " + max);
    }
}
