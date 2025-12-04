package Review01;

public class IAMYOURFATHER {
    public static void main(String[] args) {
        int day = 1;
        int total = 1;
        int depo = 1;

        System.out.println("day:" + day + " total savings:" + total);

        while (total < 1000000) {
            day++;
            depo = depo * 2;
            total += depo;
            System.out.println("day:" + day + " total savings:" + total);
        }
        System.out.println();
        System.out.println("Number of day is:" + day);
    }
}
