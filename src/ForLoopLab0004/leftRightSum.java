package ForLoopLab0004;

import java.util.Scanner;

public class leftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

    int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            leftSum=currentNum+leftSum;
        }
    int rightSum = 0;
        for (int i = 1; i <=n ; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            rightSum=currentNum+rightSum;

        }

        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else System.out.printf("No, diff = %d",Math.abs(leftSum-rightSum));



    }
}
