package ForLoopLab;

import java.util.Scanner;

public class sumNums_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i<n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(number>maxNum){
                maxNum=number;
            }

            if(number<minNum){
                minNum=number;
            }


        }

        System.out.printf("Max number: %d%n",maxNum);
        System.out.printf("Min number: %d",minNum);

    }
}
