package _inTheBegininng;

import java.util.Scanner;

public class schoolMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packPens = Integer.parseInt(scanner.nextLine());
        int packMarkers = Integer.parseInt(scanner.nextLine());
        int dashboardCleaner = Integer.parseInt(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());
        double moneyForPayment = packPens*5.80 + packMarkers*7.20 +
                dashboardCleaner*1.20;
        double paymentWithDiscount = moneyForPayment-(moneyForPayment*discountPercentage/100);

        System.out.println(paymentWithDiscount);
    }
}
