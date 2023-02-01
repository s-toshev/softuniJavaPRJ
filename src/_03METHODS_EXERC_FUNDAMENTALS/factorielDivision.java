package _03METHODS_EXERC_FUNDAMENTALS;

import java.util.Scanner;

public class factorielDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double divisionResult = (returnFactorial(n1)*1.0)
                /returnFactorial2(n2);
        System.out.printf("%.2f",divisionResult);

    }

    public static long returnFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static long returnFactorial2(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;

    }
}