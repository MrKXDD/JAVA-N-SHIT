package Lab12;

import java.util.Scanner;

public class gradinBS {
    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
        StuCheck(answers);
    }

    public static char[][] StuAnswer() {
        Scanner input = new Scanner(System.in);

        char[][] m = new char[8][10];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.next().charAt(0);
            }
        }
        return m;
    }

    public static void StuCheck(char[][] m) {
        char[][] Key = {
                { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' } };
        int correct = 0;
        for (int row = 0; row < m.length; row++) {
            for (int columns = 0; columns < m[row].length; columns++) {
                if (m[row][columns] == Key[0][columns]) {
                    correct++;
                }
            }
            System.out.println("Student" + row + "'s correct count is " + correct);
            correct = 0;
        }
    }

}
