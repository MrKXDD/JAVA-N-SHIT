package Lab11_1;

import java.util.Random;

public class GradinRando {
    public static void main(String[] args) {
        Random rng = new Random();
        int Acount=0,Bcount=0,Ccount=0,Dcount=0,Fcount=0;
        int[] Stu = new int[100];
        for (int i = 0; i < Stu.length; i++) {
            double rngesusScore = rng.nextInt(101);
            if (rngesusScore >= 80) {
                Acount += 1;
            }
            if (rngesusScore >= 70 && rngesusScore <= 79) {
                Bcount += 1;
            }
            if (rngesusScore >= 60 && rngesusScore <= 69) {
                Ccount += 1;
            }
            if (rngesusScore >= 50 && rngesusScore <= 59) {
                Dcount += 1;
            }
            if (rngesusScore <= 49) {
                Fcount += 1;
            }
        }
        System.out.println("Student got A >>" + Acount);
        System.out.println("Student got B >>" + Bcount);
        System.out.println("Student got C >>" + Ccount);
        System.out.println("Student got D >>" + Dcount);
        System.out.println("Student got F >>" + Fcount);
        System.out.println("Total Student >>" + (Acount+Bcount+Ccount+Dcount+Fcount));
    }
}
