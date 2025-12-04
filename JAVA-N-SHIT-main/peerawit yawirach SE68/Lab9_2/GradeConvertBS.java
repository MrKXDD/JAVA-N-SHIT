package Lab9_2;

import java.util.Scanner;

public class GradeConvertBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Score = 0, Operating = 1, Credits = 0, maxCreds = 0;
        double GPA = 0.0, MaxGPA = 0.0, AllGPA = 0.0;
        String Grade = "", Operation = "";
        while (Operating == 1) {
            System.out.print("Enter the subject name: ");
            String Subjects = input.nextLine();
            System.out.print("Enter Subject Credits: ");
            Credits = input.nextInt();
            maxCreds += Credits;
            System.out.print("Enter the Numerical score: ");
            Score = input.nextInt();
            input.nextLine();
            GPA = GpaCalc(Score);
            AllGPA += GPA * Credits;
            Grade = Convertable(Score);
            System.out.println("Grades: " + Grade + " | " + "GPA: " + GPA);
            System.out.print("Add another Subject? (yes/no): ");
            Operation = input.nextLine();
            if (Operation.equalsIgnoreCase("no")) {
                Operating = 0;
            }
            if (Operation.equalsIgnoreCase("yes")) {
                Operating = 1;
            }
        }
        MaxGPA = AllGPA / maxCreds;
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Calculating Final GPA...");
        System.out.println("Total Credits: " + maxCreds);
        System.out.printf("Your Final GPA is: %.2f" , MaxGPA);
        System.out.println();
    }

    public static String Convertable(int calcscore) {
        String Grades = "";
        if (calcscore < 60) {
            Grades = "F";
        }
        if (calcscore >= 60) {
            Grades = "D";
        }
        if (calcscore >= 70) {
            Grades = "C";
        }
        if (calcscore >= 80) {
            Grades = "B";
        }
        if (calcscore >= 90) {
            Grades = "A";
        }
        if (calcscore > 100 || calcscore < 0) {
            Grades = "Invalid Score";
        }
        return Grades;
    }

    public static Double GpaCalc(int calcgpa) {
        double Gpa = 0.0;
        if (calcgpa < 60) {
            Gpa = 0.0;
        }
        if (calcgpa >= 60) {
            Gpa = 1.0;
        }
        if (calcgpa >= 70) {
            Gpa = 2.0;
        }
        if (calcgpa >= 80) {
            Gpa = 3.0;
        }
        if (calcgpa >= 90) {
            Gpa = 4.0;
        }
        if (calcgpa > 100 || calcgpa < 0) {
            Gpa = -1.0;
        }
        return Gpa;
    }
}
