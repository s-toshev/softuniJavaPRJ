package FUNDAMENTALSJava2022Excercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = num1; i <=num2 ; i++) {

            sum = sum+i;
            System.out.print(i + " ");
        }
        System.out.printf("%nSum: %d",sum);
    }
}
