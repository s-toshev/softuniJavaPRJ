package _inTheBegininng;

import java.util.Scanner;

public class Greenthefuck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Meters = Double.parseDouble(scanner.nextLine());
        double Price = Meters*7.61;
        double Discount = Price*0.18;
        double Total = Price-Discount;

        System.out.println("The final price is: " + Total + " lv.");
        System.out.println("The discount is: " + Discount + " lv.");
    }
}
