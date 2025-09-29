package Lab10_2;

public class AdvanceCalc {
    public static void main(String[] args) {
        AdvanceCalc calc = new AdvanceCalc();
        System.out.println("Add int: " + calc.add(2, 3));
        System.out.println("Add double: " + calc.add(2.5, 3.5));
        System.out.println("Add int/double: " + calc.add(2, 3.5));
        System.out.println("Subtract int: " + calc.subtract(5, 2));
        System.out.println("Subtract double: " + calc.subtract(5.5, 2.2));
        System.out.println("Subtract int/double: " + calc.subtract(5, 2.2));
        System.out.println("Multiply int: " + calc.multiply(3, 4));
        System.out.println("Multiply double: " + calc.multiply(3.5, 4.5));
        System.out.println("Multiply int/double: " + calc.multiply(3, 4.5));
        System.out.println("Divide int: " + calc.divide(10, 4));
        System.out.println("Divide double: " + calc.divide(10.0, 4.0));
        System.out.println("Divide int/double: " + calc.divide(10, 4.0));
        System.out.println("Divide by zero: " + calc.divide(10, 0));
        System.out.println("Power: " + calc.power(2.0, 3));
    }

    public static int add(int n1, int n2) {
        int result;
        result = n1 + n2;
        return result;
    }

    public static double add(double n1, double n2) {
        double result;
        result = n1 + n2;
        return result;
    }

    public static double add(int n1, double n2) {
        double result;
        result = n1 + n2;
        return result;
    }

    public static int subtract(int n1, int n2) {
        int result;
        result = n1 - n2;
        return result;
    }

    public static double subtract(double n1, double n2) {
        double result;
        result = n1 - n2;
        return result;
    }

    public static double subtract(int n1, double n2) {
        double result;
        result = n1 - n2;
        return result;
    }

    public static int multiply(int n1, int n2) {
        int result;
        result = n1 * n2;
        return result;
    }

    public static double multiply(double n1, double n2) {
        double result;
        result = n1 * n2;
        return result;
    }

    public static double multiply(int n1, double n2) {
        double result;
        result = n1 * n2;
        return result;
    }

    public static double divide(int n1, int n2) {
        int result;
        if (n1 == 0 || n2 == 0) {
            System.out.println("Error: Division by zero!");
            result = 0;
        } else {
            result = n1 / n2;
        }
        return result;
    }

    public static double divide(double n1, double n2) {
        double result;
        if (n1 == 0 || n2 == 0) {
            System.out.println("Error: Division by zero!");
            result = 0.0;
        } else {
            result = n1 / n2;
        }
        return result;
    }

    public static double divide(int n1, double n2) {
        double result;
        if (n1 == 0 || n2 == 0) {
            System.out.println("Error: Division by zero!");
            result = 0.0;
        } else {
            result = n1 / n2;
        }
        return result;
    }

    public static double power(double n1, int n2) {
        double result;
        result = Math.pow(n1, n2);
        return result;
    }
}
