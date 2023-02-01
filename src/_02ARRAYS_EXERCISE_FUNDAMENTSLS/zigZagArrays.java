package _02ARRAYS_EXERCISE_FUNDAMENTSLS;

import java.util.Arrays;
import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int row = 1; row <= n; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if (row % 2 == 0) {
                secondArr[row - 1] = firstNum;
                firstArr[row - 1] = secondNum;
            } else {
                firstArr[row - 1] = firstNum;
                secondArr[row - 1] = secondNum;
            }

        }

        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));

    }
}
