package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class foodDeliv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishM = Integer.parseInt(scanner.nextLine());
        int vegeM = Integer.parseInt(scanner.nextLine());

        double chPrce = chickenMenu*10.35;
        double fishPr = fishM*12.40;
        double vegePrice = vegeM*8.15;
        double delivery = 2.50;
        double dessertPrice = (chPrce+fishPr+vegePrice)*0.20;

        double total = chPrce+fishPr+vegePrice+dessertPrice+delivery;

        System.out.println(total);

    }
}
