package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class _e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] intArr = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < intArr.length ; i++) {
            if(intArr[i]%2==0){
               evenSum+=intArr[i];
            }else{
                oddSum+=intArr[i];
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
