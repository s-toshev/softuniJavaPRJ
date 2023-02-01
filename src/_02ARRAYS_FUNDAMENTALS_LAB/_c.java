package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class _c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream
                (scanner.nextLine().split(" ")).mapToInt(
                        Integer::parseInt).toArray();

        int evenSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]%2==0){
                evenSum+=numArr[i];
            }
        }
        System.out.println(evenSum);
    }
}
