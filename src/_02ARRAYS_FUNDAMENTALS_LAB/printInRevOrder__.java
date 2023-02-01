package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class printInRevOrder__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrN = new int[n];

        for (int i = 0; i < arrN.length; i++) {
            int inputNum = Integer.parseInt(scanner.nextLine());
            arrN[i]=inputNum;
        }

        for (int i = arrN.length-1; i >=0 ; i--) {
            System.out.printf("%d ",arrN[i]);
        }

    }
}
