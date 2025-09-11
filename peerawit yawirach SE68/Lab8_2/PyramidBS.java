package Lab8_2;

public class PyramidBS {
    public static void main(String[] args) {
        int rows = 8, width = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows-i ; j> 0 ; j--) {
                System.out.print("\t");
            }
            for (int x = 0; x <= width; x++) {
                System.out.printf("%4d\t", (int)Math.pow(2, x));
            }width++;
            for (int x = width-1; x >= 1; x--) {
                System.out.printf("%4d\t", (int)Math.pow(2, x)/2);
            }
            System.err.println();
        }
    }
}
