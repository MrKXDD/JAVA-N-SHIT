package Lab6_2;

import java.util.Scanner;

public class SeasonsCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Month = 0;

        System.out.println("What Month???: ");
        Month = input.nextInt();

        switch (Month) {
            case 12:
                System.out.println("Month: December, Season: Winter");
                break;
            case 1:
                System.out.println("Month: January, Season: Winter");
                break;
            case 2:
                System.out.println("Month: Febuary, Season: Winter");
                break;
            case 3:
                System.out.println("Month: March, Season: Spring");
                break;
            case 4:
                System.out.println("Month: April, Season: Spring");
                break;
            case 5:
                System.out.println("Month: May, Season: Spring");
                break;
            case 6:
                System.out.println("Month: June, Season: Summer");
                break;
            case 7:
                System.out.println("Month: July, Season: Summer");
                break;
            case 8:
                System.out.println("Month: August, Season: Summer");
                break;
            case 9:
                System.out.println("Month: September, Season: Autumm");
                break;
            case 10:
                System.out.println("Month: October, Season: Autumm");
                break;
            case 11:
                System.out.println("Month: November, Season: Autumm");
                break;
            default:
                System.out.println("Error FuckNuts");
                break;
        }
    }
}
