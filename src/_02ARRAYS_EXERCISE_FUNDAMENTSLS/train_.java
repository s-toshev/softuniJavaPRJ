package _02ARRAYS_EXERCISE_FUNDAMENTSLS;

import java.util.Scanner;

public class train_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int peopleOnWagon = Integer.parseInt(scanner.nextLine());
            numArr[i] = peopleOnWagon;
        }

        for (int i = 0; i < numArr.length; i++) {
            sum = sum + numArr[i];
        }

        for (int item : numArr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        System.out.println(sum);
    }
}
