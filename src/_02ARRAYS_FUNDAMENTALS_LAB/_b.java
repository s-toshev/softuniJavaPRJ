package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class _b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] numArr = new int[n];

        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numArr[i]=num;
        }

        for (int i = numArr.length-1; i >=0; i--) {
            System.out.print(numArr[i]+ " ");
        }
    }
}
