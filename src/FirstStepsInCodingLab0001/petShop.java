package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogPrice = dogFood*2.50;
        int catPrice = catFood*4;

        double total = dogPrice+catPrice;

        System.out.printf("%.1f lv.",total);
    }
}
