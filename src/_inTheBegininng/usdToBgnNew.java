package _inTheBegininng;

import java.util.Scanner;

public class usdToBgnNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Usd = Double.parseDouble(scanner.nextLine());
        double Bgn = Usd * 1.79549;

        System.out.println(Bgn);
    }
}
