package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class rectangleArea_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double result = rectangleArea(a,b);
        System.out.printf("%.0f",result);
    }

    public static double rectangleArea(double a1, double b1) {
       return a1*b1;
    }

}