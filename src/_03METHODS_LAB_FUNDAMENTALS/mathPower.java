package _03METHODS_LAB_FUNDAMENTALS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numIn = Double.parseDouble(scanner.nextLine());
        double powerIn = Double.parseDouble(scanner.nextLine());

        double result = mathPower(numIn,powerIn);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double mathPower(double num, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }
        return result;
    }
}
