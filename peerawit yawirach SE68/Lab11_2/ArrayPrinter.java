package Lab11_2;

public class ArrayPrinter {
    public static void main(String[] args) {
        int[] integerArray = { 10, 20, 30, 40, 50 };
        double[] doubleArray = { 0.1, 9.3, 6.4, 5.0, 4.8 };
        char[] chaArray = { 'a', 'b', 'c', 'd', 'e' };
        String[] StringArray = { "Java", "is", "fun" };
        printArray(chaArray);
        printArray(StringArray);
        printArray(doubleArray);
        printArray(integerArray);

    }

    public static void printArray(int[] arr) {
        String Farr = "";
        for (int i = 0; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("integer array: " + Farr);
    }

    public static void printArray(double[] arr) {
        String Farr = "";
        for (int i = 0; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("double array: " + Farr);
    }

    public static void printArray(String[] arr) {
        String Farr = "";
        for (int i = 0; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("string array: " + Farr);
    }

    public static void printArray(char[] arr) {
        String Farr = "";
        for (int i = 0; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("char array: " + Farr);
    }
}
