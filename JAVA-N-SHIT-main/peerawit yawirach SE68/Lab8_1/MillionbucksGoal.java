package Lab8_1;

public class MillionbucksGoal {
    public static void main(String[] args) {
        int  month = 0;
        double Interest = 0.01, Currentmone =1000;
        for ( ; Currentmone < 1000000; month++) {
            Currentmone += Currentmone * Interest;
        }
        int Years = month/12;
        month -= Years*12;
        System.out.println("Reach or Exceed 1M in: " + Years + " Years and " + month + " Months");
        System.out.printf("Mone you have in $ is: %.0f" , Currentmone);
        System.out.println();
    }
}
