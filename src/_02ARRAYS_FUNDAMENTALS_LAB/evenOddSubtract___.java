package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class evenOddSubtract___ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(
                        Integer::parseInt).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numArr.length ; i++) {
            if(numArr[i]%2==0){
                evenSum=evenSum+numArr[i];
            }else{
                oddSum=oddSum+numArr[i];
            }
        }

        System.out.println(evenSum-oddSum);

    }
}
