package _03METHODS_EXERC_FUNDAMENTALS;

import java.util.Scanner;

public class nXnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        rowCol(n);

    }

    private static void rowCol(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }


}
