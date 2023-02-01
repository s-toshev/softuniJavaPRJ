package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class _d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().
                split(" ");

        for (int i = 0; i < strArr.length/2; i++) {
            String oldValue = strArr[i];
            strArr[i]=strArr[strArr.length-1-i];
            strArr[strArr.length-1-i]=oldValue;
        }
        System.out.println(String.join(" ",strArr));
    }
}
