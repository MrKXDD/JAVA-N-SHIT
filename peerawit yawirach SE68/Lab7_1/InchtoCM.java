package Lab7_1;

public class InchtoCM {
    public static void main(String[] args) {
        System.out.println("Inches        CM");
        int i =1;
        double CM = 2.54;
        while (i <=199) {
            System.out.println(i + "            " + (CM*i));
            i++;
        }
    }
}
