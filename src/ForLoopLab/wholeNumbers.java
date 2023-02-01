package ForLoopLab;

import java.util.Scanner;

public class wholeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            if (num2 > maxNum) {
                maxNum = num2;
            }
            if (num2 < minNum) {
                minNum = num2;
            }
        }
        System.out.printf("Max number: %d%n",maxNum);
        System.out.printf("Min number: %d",minNum);
    }
}
