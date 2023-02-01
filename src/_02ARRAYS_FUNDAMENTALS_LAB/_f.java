package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class _f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(
                Integer::parseInt
        ).toArray();

        int[] arr2 = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(
                Integer::parseInt
        ).toArray();
        boolean isIdentical = true;
        int sum = 0;
        int diffIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                sum += arr1[i];
            } else {
                isIdentical = false;
                diffIndex=i;
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are " +
                    "identical. Sum: %d", sum);
        }else{
            System.out.printf("Arrays are not identical." +
                    " Found difference at %d index.",diffIndex);
        }
    }
}
