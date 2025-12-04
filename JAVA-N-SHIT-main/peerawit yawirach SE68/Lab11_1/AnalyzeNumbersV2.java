package Lab11_1;

import java.util.Scanner;

public class AnalyzeNumbersV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        System.out.print("Enter the numbers: ");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        System.out.println("Allthem numbers: " + printArray(numbers));
        System.out.println("Average is: " + average);
        System.out.println("number of elements above the average is: " + count);
        System.out.println("min is: " + findMin(numbers));
        System.out.println("mx is: " + findMax(numbers));
    }
    public static String printArray(double[] nums) {
        String arr = "";
        for (int i = 0; i < nums.length; i++) {
            arr = arr += nums[i] + " ";
        }
        return arr;
    }
    public static double findMax(double[] nums) {
        double max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static double findMin (double[] nums) {
        double min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
