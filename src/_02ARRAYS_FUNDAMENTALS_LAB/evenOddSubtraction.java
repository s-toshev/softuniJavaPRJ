package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class evenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int item : numArr) {
            if(item%2==0){
                evenSum=evenSum+item;
            }else {
                oddSum=oddSum+item;
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
