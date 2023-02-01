package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class revArrayStr_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letterArr = scanner.nextLine()
                .split(" ");

        for (int i = 0; i < letterArr.length/2 ; i++) {
            String oldValue = letterArr[i];
            letterArr[i]=letterArr[letterArr.length-1-i];
            letterArr[letterArr.length-1-i]=oldValue;
        }

        System.out.println(String.join(" ",letterArr));

    }
}
