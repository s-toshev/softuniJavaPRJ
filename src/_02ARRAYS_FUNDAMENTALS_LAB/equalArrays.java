package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int diffIndex = 0;
        boolean isEqual = true;
        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];
            if(num1==num2){
                sum = sum + num1;
            }else {
                diffIndex=i;
                isEqual=false;
                break;
            }
        }
        if(isEqual){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference" +
                    " at %d index.",diffIndex);
        }
    }
}
