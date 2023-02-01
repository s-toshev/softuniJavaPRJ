package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class test1__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] intArray = new int[n];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(intArray));
    }
}
