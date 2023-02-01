package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArrayStrings_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        for (int i = 0; i < text.length / 2; i++) {
            String oldValue = text[i];
            text[i] = text[text.length - 1-i];
            text[text.length-1-i]=oldValue;
        }

        System.out.println(String.join(" ",text));

    }
}
