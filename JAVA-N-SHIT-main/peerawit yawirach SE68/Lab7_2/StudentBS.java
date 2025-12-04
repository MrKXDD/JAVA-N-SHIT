package Lab7_2;

import java.util.Scanner;

public class StudentBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int StuNum = 0, Score = 0, HighScore = 0;
        String Stuname = "", HighName = "";
        System.out.print("Enter Number of Students: ");
        StuNum = input.nextInt();
        while (StuNum > 0) {
            StuNum -= 1;
            System.out.print("Enter Student Name: ");
            Stuname = input.next();
            System.out.print("Enter Student Score: ");
            Score = input.nextInt();
            if (Score > HighScore) {
                HighName = Stuname;
                HighScore = Score;
            }
        }
        System.out.println("Highest Score: " + HighName + " " + "(" + HighScore +")");
    }
}
