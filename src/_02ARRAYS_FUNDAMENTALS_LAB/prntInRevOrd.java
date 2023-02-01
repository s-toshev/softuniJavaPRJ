package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class prntInRevOrd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] nArr = new int[n];


        for (int i = 0; i < nArr.length ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            nArr[i]=num;
        }

        for (int i = nArr.length-1; i >=0 ; i--) {
            System.out.printf("%d ",nArr[i]);
        }

    }
}
