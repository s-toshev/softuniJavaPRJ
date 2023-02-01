package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(recArea(Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine())));

    }

    public static int recArea (int a, int b){
        int area = a*b;

        return area;
    }

}
