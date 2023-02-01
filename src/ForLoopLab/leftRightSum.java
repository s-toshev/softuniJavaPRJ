package ForLoopLab;

import java.util.Scanner;

public class leftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + num1;
        }
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + num2;
        }


        //if (rightSum == leftSum) {
          //  System.out.printf("Yes, sum = %d", leftSum);
        //} else System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));

        System.out.println(leftSum);
        System.out.println(rightSum);

    }
}
