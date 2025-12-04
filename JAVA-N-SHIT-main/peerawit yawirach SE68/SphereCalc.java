import java.util.Scanner;
public class SphereCalc {
    public static void main(String[] args) {
        double Radius;
        double Volume;
        double Surface;

        Scanner input = new Scanner(System.in);
        System.out.println("The radius if the sphere: ");
        Radius = input.nextDouble();

        Volume = (4/3 * Math.PI * Math.pow(Radius, 3));
        Surface = 4 * Math.PI * Math.pow(Radius, 2);

        System.out.printf("The Sphere volume: %.2f" , Volume);
        System.out.printf(" The Sphere Surface: %.2f" , Surface);
    }
}
