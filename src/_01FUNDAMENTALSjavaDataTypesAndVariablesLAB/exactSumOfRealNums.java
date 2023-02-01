package _01FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.math.BigDecimal;
import java.util.Scanner;

public class exactSumOfRealNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal summ = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            summ=summ.add(number);
        }
        System.out.println(summ);
    }
}
