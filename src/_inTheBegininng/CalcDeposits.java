package _inTheBegininng;

import java.util.Scanner;

public class CalcDeposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Deposit = Double.parseDouble(scanner.nextLine());
        int Period = Integer.parseInt(scanner.nextLine());
        double yearlyPercentage = Double.parseDouble(scanner.nextLine());

        double totalValue = Deposit+Period*((Deposit*yearlyPercentage/100)/12);

        System.out.println(totalValue);
    }
}
