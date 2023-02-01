package _03METHODS_EXERC_FUNDAMENTALS;

import java.util.Scanner;

public class smallestOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.print(minNum(n1,n2,n3));

    }

    public static int minNum(int n1, int n2, int n3) {
        int maxNum = Integer.MAX_VALUE;

        if (n1 < maxNum) {
            maxNum = n1;
        }
        if (n2 < maxNum) {
            maxNum = n2;
        }
        if (n3 < maxNum) {
            maxNum = n3;
        }
        return maxNum;

    }
}
