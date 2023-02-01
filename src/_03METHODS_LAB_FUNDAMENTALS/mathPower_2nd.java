package _03METHODS_LAB_FUNDAMENTALS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(name(num,power)));
    }

    public static double name(double num, double power) {
        double sum = 1;
        for (int i = 1; i <= power; i++) {
            sum = sum * num;
        }
        return sum;
    }
}
