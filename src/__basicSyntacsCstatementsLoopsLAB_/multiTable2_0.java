package __basicSyntacsCstatementsLoopsLAB_;

import java.util.Scanner;

public class multiTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n2 > 10) {
            System.out.printf("%d X %d = %d", n1, n2, (n1 * n2));
        }

        for (int i = n2; i <= 10; i++) {

            System.out.printf("%d X %d = %d%n", n1, i, (n1 * i));

        }
    }
}
