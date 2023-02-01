package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int[] numArr = Arrays.stream(scanner.nextLine()
             .split(" ")).mapToInt(Integer::parseInt).toArray();

     int evenSum = 0;

        for (int i = 0; i < numArr.length ; i++) {
            int curElement = numArr[i];
            if(curElement%2==0){
                evenSum=evenSum+curElement;
            }
        }

    }
}
