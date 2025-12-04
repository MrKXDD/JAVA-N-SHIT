package Lab8_1;

public class LeapYears {
    public static void main(String[] args) {
        int leap = 0, leapcount = 0, timeleap = 0, timeleapcount = 0;
        for (int i = 101; i <= 2100; i++) {
            if (i %4 ==0 && !(i%100 == 0) ||  i%400 == 0 ) {
                leap = i;
                timeleap = 0;
                System.out.print(i + " ");
                timeleapcount += 1;
                leapcount += 1;
                if (timeleapcount == 10) {
                    System.out.println();
                    timeleapcount = 0;
                }
            }
        }
        System.out.println();
        System.out.println("Number of Leap year is: " + leapcount);
    }
}
