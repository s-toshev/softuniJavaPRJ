package FUNDAMENTALSjavaLab222;

import java.util.Scanner;

public class multiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i <=num; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.printf("%d X %d = %d%n",i,j,i*j);
            }
        }
    }
}
