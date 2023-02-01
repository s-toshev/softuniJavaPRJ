package forLoopExerc;

import java.util.Scanner;

public class equalElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        int total = 0;
        for (int i = 1; i <=n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());

            sum=sum+num1;
            if(maxNum<num1){
                maxNum=num1;
            }
            total=sum-maxNum;
        }
        if(total==maxNum){
            System.out.printf("Yes%nSum = %d",total);
        }else System.out.printf("No%nDiff = %d",Math.abs(total-maxNum));
    }
}
