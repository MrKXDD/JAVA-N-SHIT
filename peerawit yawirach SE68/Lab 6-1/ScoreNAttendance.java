import java.util.Scanner;

public class ScoreNAttendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double FXScore = 0, MXScore = 0, Attendance = 0;

        System.out.println("FinalExamScore: ");
        FXScore = input.nextDouble();

        System.out.println("MidtermExamScore: ");
        MXScore = input.nextDouble();

        System.out.println("Attendance: ");
        Attendance = input.nextDouble();

        if (FXScore > 90 && Attendance >= 95) {
            System.out.println("Pass With Distinction");
        } else if (FXScore > 50 && (MXScore > 40 || Attendance >= 80)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
