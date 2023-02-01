package FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.util.Scanner;

public class meterKm01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meter = Integer.parseInt(scanner.nextLine());

        double kms = (meter*1.0)/1000;

        System.out.printf("%.2f",kms);
    }
}
