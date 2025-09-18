package Lab9_1;

public class TestMax {
    /** Main method */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int x = 9;
        int y = 7;
        int z = max(i, j, x, y); // Invoke max method
        System.out.println("The maximum between " + i +
                " and " + j + " and " + x +
                " and " + y + " is " + z);
    }

    /** Return the max between two numbers */
    public static int max(int num1, int num2, int num3, int num4) {
        int numhigh = num1;
        if (num1 < num2) {
            numhigh = num2;
        }
        if (numhigh < num3) {
            numhigh = num3;
        }
        if (numhigh < num4) {
            numhigh = num4;
        }
        return numhigh; // Return result
    }
}
