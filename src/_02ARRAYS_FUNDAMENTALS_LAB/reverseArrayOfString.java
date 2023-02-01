package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class reverseArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArr = scanner.nextLine().split(" ");

        for (int i = 0; i < textArr.length/2 ; i++) {
            String oldValue = textArr[i];
            textArr[i]=textArr[textArr.length-1-i];
            textArr[textArr.length-1-i]=oldValue;
        }
        System.out.println(String.join(" ",textArr));
    }
}
