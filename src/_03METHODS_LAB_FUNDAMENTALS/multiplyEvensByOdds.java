package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <=num ; i++) {

            if(num%10==0){
                evenSum=evenSum+num;
            }else {
                oddSum=oddSum+num;
            }


        }

        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}
