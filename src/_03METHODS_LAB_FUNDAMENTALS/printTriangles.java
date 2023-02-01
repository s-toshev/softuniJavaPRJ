package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class printTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        trianglePrint(inputNum);

    }

    public static void trianglePrint(int input) {
        for (int i = 1; i <= input; i++) {
            printLine(1, i);
        }
        for (int i = input-1; i >=1 ; i--) {
            printLine(1,i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
