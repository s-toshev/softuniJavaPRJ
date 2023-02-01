package _03METHODS_LAB_FUNDAMENTALS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathPower(Double.parseDouble
                (scanner.nextLine()),Integer.parseInt(scanner.nextLine()))));
    }

    public static double mathPower(double n1, int n2) {

        double result = 1;

        for (int i = 1; i <= n2; i++) {
            result = result * n1;
        }

        return result;
    }

}
