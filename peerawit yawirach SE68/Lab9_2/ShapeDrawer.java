package Lab9_2;

import java.util.Scanner;

public class ShapeDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = 0, height = 0;
        System.out.print("Enter a Width: ");
        width = input.nextInt();
        System.out.print("Enter a Height: ");
        height = input.nextInt();
        System.out.print("Enter a Symbol: ");
        char symbol = input.next().charAt(0);
        drawRectangle(width, height, symbol);
    }

    public static void drawRectangle(int width, int height, char symbol) {
        for (int i = 0; i < height; i++) {
            // Inner loop controls columns (width)
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            // New line after each row
            System.out.println();
        }
    }
}
