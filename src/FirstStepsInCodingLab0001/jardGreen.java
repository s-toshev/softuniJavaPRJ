package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class jardGreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqM = Double.parseDouble(scanner.nextLine());

        double price = sqM*7.61;
        double discount = price*0.18;
        double finalPrice = price-discount;

        System.out.printf("The final price is: " +
                "%.2f lv.",finalPrice);

        System.out.printf("The discount is %.2f lv.",discount);


    }
}
