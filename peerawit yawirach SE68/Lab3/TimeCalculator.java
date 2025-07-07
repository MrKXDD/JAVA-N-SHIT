package Lab3;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        int day = 0, hour = 0, minute = 0, Seconds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Seconds:");
        Seconds = input.nextInt();
        while (Seconds >= 86400) {
            Seconds -= 86400;
            day += 1;
        }
        while (Seconds >= 3600) {
            Seconds -= 3600;
            hour += 1;
        }
        while (Seconds >= 60) {
            Seconds -= 60;
            minute += 1;
        }
        System.out.println("Time is: " + day + "days " + hour + "hours " + minute + "minutes " + Seconds + "Seconds");
    }
}