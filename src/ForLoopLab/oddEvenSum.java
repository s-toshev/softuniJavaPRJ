package ForLoopLab;

import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum=0;
        int evenSum=0;
        for (int i = 1; i <=n ; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());

            if(i%2==0){
                evenSum=evenSum+num1;
            }else oddSum=oddSum+num1;

        }

        if(evenSum==oddSum){
            System.out.printf("Yes%nSum = %d",evenSum);
        }else System.out.printf("No%nDiff = %d",Math.abs(evenSum-oddSum));

    }
}
