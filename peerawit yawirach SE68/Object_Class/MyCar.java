package Object_Class;

public class MyCar {
    public static void main(String[] args) {
        Car Toyota = new Car(null);
        Toyota.setSpeed(200);
        Toyota.Color = "Red";
        Toyota.setMileage(1345);

        Car Honda = new Car(null);
        Honda.setSpeed(300);
        Honda.setMileage(8987);
        Honda.Color = "Blue";

        System.out.println("Toyota color:" + Toyota.Color + " Speed:" + Toyota.Speed + " mileage:" + Toyota.Mileage);
        System.out.println("Honda color:" + Honda.Color + " Speed:" + Honda.Speed + " mileage:" + Honda.Mileage);
    }
}
