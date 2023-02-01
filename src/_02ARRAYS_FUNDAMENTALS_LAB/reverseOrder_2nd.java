package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class reverseOrder_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] number = new int[n];

        for (int i = 0; i < n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            number[i]=currentNum;
        }

        for (int j = number.length-1; j >=0 ; j--) {
            System.out.printf("%d ",number[j]);
        }

    }
}
