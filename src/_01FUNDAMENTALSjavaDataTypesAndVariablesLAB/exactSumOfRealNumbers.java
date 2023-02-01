package _01FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.math.BigDecimal;
import java.util.Scanner;

public class exactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal bigDecimalSum = new BigDecimal(0);
        for (int i = 1; i <=n ; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
            bigDecimalSum=bigDecimalSum.add(num);
        }

        System.out.println(bigDecimalSum);
    }
}
