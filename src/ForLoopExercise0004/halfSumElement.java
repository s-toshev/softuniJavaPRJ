package ForLoopExercise0004;

import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        int sum =0;
        int maxValue=Integer.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
            int cNum=Integer.parseInt(scanner.nextLine());
            sum=sum+cNum;

            if (cNum>maxValue){
                maxValue=cNum;
            }
        }
            sum=sum-maxValue;

        if (sum==maxValue){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum-maxValue));
        }
    }
}
