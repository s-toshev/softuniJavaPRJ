package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        productQuantityPrint(product,quantity);

    }

    public static void productQuantityPrint(String prod, double qty) {

        switch (prod) {
            case "coffee":
                qty = qty * 1.50;
                System.out.printf("%.2f",qty);
                break;
            case "water":
                qty = qty * 1.00;
                System.out.printf("%.2f",qty);
                break;
            case "coke":
                qty = qty * 1.40;
                System.out.printf("%.2f",qty);
                break;
            case "snacks":
                qty = qty * 2.00;
                System.out.printf("%.2f",qty);
                break;
        }


    }

}
