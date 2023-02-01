package _01_1FUNDAMENTALSjavaDataTypesAndVariablesExcercise;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int m = n%100;

        System.out.println(m);

    }
}
