package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class reverseOrder__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArr = new int[n];
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            //currentNum на позиция i т.е. 0 , става стойността на
            //масив numArr и така до n
            numArr[i] = currentNum;
        }

        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.printf("%d ",numArr[i]);

        }
    }
}
