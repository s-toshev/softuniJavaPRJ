package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class signOfInt_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        intSign(n);

    }
    public static void intSign (int n1){
        if(n1>0){
            System.out.printf("The number %d is positive.",n1);
        }else if(n1<0){
            System.out.printf("The number %d is negative.",n1);
        }else{
            System.out.printf("The number %d is zero.",n1);
        }
    }
}
