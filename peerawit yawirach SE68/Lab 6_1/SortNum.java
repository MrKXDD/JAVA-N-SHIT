import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public interface SortNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = 0 , num2 = 0 , num3 = 0;
        List<Double> Sortin = new ArrayList();
        
        System.out.println("Insert num1: ");
        Sortin.add(num1 = input.nextDouble());
        
        System.out.println("Insert num2: ");
        Sortin.add(num2 = input.nextDouble());

        System.out.println("Insert num3: ");
        Sortin.add(num3 = input.nextDouble());

        Sortin.sort(Comparator.naturalOrder());

        System.out.println(Sortin);
    }
}
