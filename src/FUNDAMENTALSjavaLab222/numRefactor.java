package FUNDAMENTALSjavaLab222;

import java.util.Scanner;

public class numRefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <=num*2 ; i++) {
            if(i%2!=0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
