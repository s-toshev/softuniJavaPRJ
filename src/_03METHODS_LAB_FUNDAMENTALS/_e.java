package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        orderCalculation(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));


    }

    public static void orderCalculation(String product, int quantity){
        double totalPrice = 0;
        switch (product){
            case "coffee":
                totalPrice=quantity*1.50;
                System.out.printf("%.2f",totalPrice);
                break;
            case "water":
                totalPrice=quantity*1.00;
                System.out.printf("%.2f",totalPrice);
                break;
            case "coke":
                totalPrice=quantity*1.40;
                System.out.printf("%.2f",totalPrice);
                break;
            case"snacks":
                totalPrice=quantity*2.00;
                System.out.printf("%.2f",totalPrice);
                break;
        }
    }

}
