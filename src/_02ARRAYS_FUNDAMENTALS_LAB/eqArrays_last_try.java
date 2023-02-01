package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class eqArrays_last_try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fstArr = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int[] secArr = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        int index = 0;
        boolean isEqual = true;
        for (int i = 0; i < fstArr.length; i++) {

            if(fstArr[i]==secArr[i]){
                sum = sum + fstArr[i];
            }else {
                isEqual=false;
                index=i;
                break;
            }


        }

        if(isEqual){
            System.out.printf("Arrays are identical. " +
                    "Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical." +
                    " Found difference at %d index.",index);
        }

    }
}
