package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _a {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        signPrint(scanner.nextInt());

    }

    public static void signPrint (int num){
        if(num > 0){
            System.out.printf("The number %d is positive.",num);
        }else if (num < 0){
            System.out.printf("The number %d is negative.",num);
        }else {
            System.out.println("The number 0 is zero.");
        }
    }

}
