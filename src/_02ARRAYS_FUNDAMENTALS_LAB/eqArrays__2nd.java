package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class eqArrays__2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        boolean isIdentical = true;
        int arrSum = 0;
        int index = 0;
        for (int i = 0; i < firstArr.length; i++) {
          int firstNum = firstArr[i];
          int secondNum = secondArr[i];

          if(firstNum==secondNum){
              arrSum=arrSum+firstNum;
          }else {
              isIdentical=false;
              index=i;
              break;
          }

        }

        if(isIdentical){
            System.out.printf("Arrays are identical. " +
                    "Sum: %d",arrSum);
        }else {
            System.out.printf("Arrays are not identical." +
                    " Found difference at %d index.",index);
        }
    }
}