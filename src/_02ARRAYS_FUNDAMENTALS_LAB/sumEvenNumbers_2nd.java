package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < numArray.length ; i++) {
            if(numArray[i]%2==0){
                sum=sum+numArray[i];
            }
        }

        System.out.println(sum);

    }
}
