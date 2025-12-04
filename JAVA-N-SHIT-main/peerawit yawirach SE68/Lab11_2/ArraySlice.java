package Lab11_2;

import java.util.Scanner;

public class ArraySlice {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        String[] words = { "alpha", "bravo", "charlie", "delta", "echo" };
        printArray(numbers);
        printArray(words);
        SlicinINT(numbers);
        SlicinSTR(words);
        SubSliceINT(numbers);
        SubSliceSTR(words);
    }

    public static void SlicinINT(int[] arr) {
        Scanner input = new Scanner(System.in);
        String Farr = "";
        int Sindex = 0, eindex = 0;
        System.out.println("Start int Index: ");
        Sindex = input.nextInt();
        System.out.println("End int Index: ");
        eindex = input.nextInt();
        if (eindex >= arr.length) {
            System.out.println("Error MF");
        }
        if (eindex < arr.length) {
            for (int i = Sindex; i < eindex; i++) {
                Farr += arr[i] + " ";
            }
            System.out.println("Slice from index " + Sindex + " to " + eindex + ":" + Farr);
        }
    }

    public static void SubSliceINT(int[] arr) {
        Scanner input = new Scanner(System.in);
        String Farr = "";
        int Sindex = 0;
        System.out.println("Start int Index: ");
        Sindex = input.nextInt();
        for (int i = Sindex; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("Slice from index " + Sindex + " to end:" + Farr);
    }

    public static void SlicinSTR(String[] arr) {
        Scanner input = new Scanner(System.in);
        String Farr = "";
        int Sindex = 0, eindex = 0;
        System.out.println("Start str Index: ");
        Sindex = input.nextInt();
        System.out.println("End str Index: ");
        eindex = input.nextInt();
        if (eindex >= arr.length) {
            System.out.println("Error MF");
        }
        if (eindex < arr.length) {
            for (int i = Sindex; i < eindex; i++) {
                Farr += arr[i] + " ";
            }
            System.out.println("Slice from index " + Sindex + " to " + eindex + ":" + Farr);
        }
    }

    public static void SubSliceSTR(String[] arr) {
        Scanner input = new Scanner(System.in);
        String Farr = "";
        int Sindex = 0;
        System.out.println("Start str Index: ");
        Sindex = input.nextInt();
        for (int i = Sindex; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("Slice from index " + Sindex + " to end:" + Farr);
    }

    public static void printArray(int[] arr) {
        String Farr = "";
        for (int i = 0; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("Original integer array: " + Farr);
    }

    public static void printArray(String[] arr) {
        String Farr = "";
        for (int i = 0; i < arr.length; i++) {
            Farr += arr[i] + " ";
        }
        System.out.println("Original string array: " + Farr);
    }
}
