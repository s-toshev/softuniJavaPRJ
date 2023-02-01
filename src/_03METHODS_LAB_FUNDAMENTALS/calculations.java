package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch ((command)) {
            case "add":
                addNumbers(num1, num2);
                break;
            case "multiply":
                multlyNumbers(num1, num2);
                break;
            case "subtract":
                subtractNumbers(num1,num2);
                break;
            case "divide":
                divideNumbers(num1,num2);
                break;
        }
    }

    public static void addNumbers(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }

    public static void multlyNumbers(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(result);

    }

    public static void divideNumbers(int n1, int n2) {
        int result = n1 / n2;
        System.out.println(result);

    }

    public static void subtractNumbers(int n1, int n2) {
        int result = n1 - n2;
        System.out.println(result);

    }
}