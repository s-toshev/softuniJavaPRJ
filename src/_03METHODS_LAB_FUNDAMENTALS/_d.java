package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case "add":
                add(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
        }
    }
    public static void add(int num1, int num2) {
        int add = num1 + num2;
        System.out.println(add);
    }

    public static void multiply(int num1, int num2) {
        int multiply = num1 * num2;
        System.out.println(multiply);
    }

    public static void subtract(int num1, int num2) {
        int subtract = num1 - num2;
        System.out.println(subtract);
    }

    public static void divide(int num1, int num2) {
        int divide = num1 / num2;
        System.out.println(divide);
    }
}