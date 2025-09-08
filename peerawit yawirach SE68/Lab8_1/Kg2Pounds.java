package Lab8_1;

public class Kg2Pounds {
    public static void main(String[] args) {
        double kg = 1, KgtoPound = 0, Pound = 20, PoundtoKg = 0;
        System.out.println("Kilograms\tPounds\t|\tPounds\t\tKilograms");

        for (; kg <= 199; kg += 2) {
            KgtoPound = kg * 2.2;
            PoundtoKg = Pound * 0.45359237;
            System.out.printf("%.0f\t\t%.0f\t|\t%.0f\t\t%.2f", kg, KgtoPound, Pound, PoundtoKg);
            System.out.println();
            Pound += 5;
        }
    }
}
