package Lab7_1;

public class WhileLoopExample {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 100) {
            System.out.print(" " + i);
            i++;

            if (i %10 == 1) {
                System.out.println();
            }
        }
    }
}