package Review01;

public class DarthVader {
    public static void main(String[] args) {
        int day = 1;
        int total = 1;
        int depo = 1;

        System.out.println("day:" + day + " deposit:" + depo + " total:" + total);

        while (day < 30) {
            day++;
            depo = depo * 2;
            total += depo;
            System.out.println("day:" + day + " deposit:" + depo + " total:" + total);
        }
    }
}
