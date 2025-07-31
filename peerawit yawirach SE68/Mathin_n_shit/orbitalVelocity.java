package Mathin_n_shit;

import java.util.Scanner;
public class orbitalVelocity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v = 0; // velocity
        double G = 6.674 * Math.pow(10, -11); // gravitational constant
        double M = 0; // celestial body mass
        double r = 0; // distance from the center of the celestial body to the object in orbit.

        //input promt
        System.out.println("Enter mass of the celestial body in kg(e.g.Earth ~5.9739e24): ");
        M = input.nextDouble(); //user input celestial body mass

        System.out.println("Enter distance from the celestial body's center to object in orbit in meters: ");
        r = input.nextDouble(); //user input orbit range

        //Calculation of velocity
        v = Math.sqrt((G*M)/r);//root of G times M then divided by r

        //make the answer into readable number
        String Velocity = String.format("%.2f", v);

        //Display answer
        System.out.println("The Orbital Velocity is: " + Velocity + " m/s");
    }
}
