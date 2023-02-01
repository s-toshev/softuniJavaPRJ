package __basicSyntacsCstatementsLoopsLAB_;

import java.util.Scanner;

public class sumOddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumNum = 0;
        for (int i = 1; i <= n; i++) {

            System.out.println(2 * i - 1);
            sumNum = sumNum + (2 * i - 1);

        }
        System.out.printf("Sum: %d", sumNum);
    }
}
