package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int result = calculatedArea(width, length);
        System.out.println(result);
    }

    public static int calculatedArea(int W, int L) {
        return W * L;
    }
}
