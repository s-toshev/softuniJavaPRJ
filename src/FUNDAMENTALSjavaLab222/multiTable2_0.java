package FUNDAMENTALSjavaLab222;

import java.util.Scanner;

public class multiTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", num,num2,num*num2);
            num2++;
        }while(num2<=10);



        }
    }

