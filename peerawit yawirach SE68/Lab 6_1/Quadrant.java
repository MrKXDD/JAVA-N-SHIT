import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Angle = 0;

        System.out.println("Enter Angle");
        Angle = input.nextDouble();

        if (Angle > 0 && Angle < 90) {
            System.out.println("This is in the I Quadrant");
        }
        else if (Angle > 90 && Angle < 180) {
            System.out.println("This is in the II Quadrant");
        }
        else if (Angle > 180 && Angle < 270) {
            System.out.println("This is in the III Quadrant");
        }
        else if (Angle > 270 && Angle < 360) {
            System.out.println("This is in the IV Quadrant");
        }
        else{
            System.out.println("It's not on any Quadrant");
        }

    }
}
