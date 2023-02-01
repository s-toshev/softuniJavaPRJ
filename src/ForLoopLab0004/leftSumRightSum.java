package ForLoopLab0004;

import java.util.Scanner;

public class leftSumRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + num;
        }
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum=rightSum+num;
        }
        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d",Math.abs(rightSum));
        }else System.out.printf("No, diff = %d",Math.abs(rightSum-leftSum));
    }
}
