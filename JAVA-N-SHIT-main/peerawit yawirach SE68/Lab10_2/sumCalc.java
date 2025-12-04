package Lab10_2;

public class sumCalc {
    public static void main(String[] args) {
        sumCalc calc = new sumCalc();
        System.out.println(calc.twoin(10, 20));
        System.out.println(calc.threein(10, 20, 30));
        System.out.println(calc.twodub(5.5, 4.5));
        System.out.println(calc.threedub(1.2, 2.3,3.4));
    }

    public static String twoin(int n1, int n2) {
        String result = "";
        result = "Adding two ints ( " + n1 + " + " + n2 + " ): " + (n1 + n2);
        return result;
    }

    public static String threein(int n1, int n2, int n3) {
        String result = "";
        result = "Adding three ints ( " + n1 + " + " + n2 + " + " + n3 + " ): " + (n1 + n2 + n3);
        return result;
    }

    public static String twodub(double n1, double n2) {
        String result = "";
        result = "Adding two doubles ( " + n1 + " + " + n2 + " ): " + (1 + n2);
        return result;
    }

    public static String threedub(double n1, double n2, double n3) {
        String result = "";
        result = "Adding three doubles ( " + n1 + " + " + n2 + " + " + n3 + " ): " + (n1 + n2 + n3);
        return result;
    }

}