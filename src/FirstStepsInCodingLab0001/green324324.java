package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class green324324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metersToGreen = Double.parseDouble(scanner.nextLine());

        double price = metersToGreen*7.61;
        double finalPrice = price - (price * 0.18);
        double discount = price-finalPrice;

        System.out.printf("The final price is: %.2f lv.",finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
