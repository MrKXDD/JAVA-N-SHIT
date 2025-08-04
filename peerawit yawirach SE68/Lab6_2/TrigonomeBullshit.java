package Lab6_2;

import java.util.Scanner;

public class TrigonomeBullshit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sinV = 0, cosV = 0, tanV = 0, Angle = 0;
        int FuncNum = 0;

        System.out.println("Input num1/2/3 [1=sin,2=cos,3=tan]: ");
        FuncNum = input.nextInt();

        System.out.println("Enter Degree you wanna calculate: ");
        Angle = input.nextDouble();
        Angle = Math.toRadians(Angle);

        switch (FuncNum) {
            case 1:
                sinV = Math.sin(Angle);
                System.out.println("Sin(" + Angle + ") = " + sinV);
                break;
            case 2:
                cosV = Math.cos(Angle);
                System.out.println("Cos(" + Angle + ") = " + cosV);
                break;
            case 3:
                tanV = Math.tan(Angle);
                System.out.println("Tan(" + Angle + ") = " + tanV);
                break;
        }
    }
}
