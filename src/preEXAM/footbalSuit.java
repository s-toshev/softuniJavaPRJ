package preEXAM;

import java.util.Scanner;

public class footbalSuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForBall = Double.parseDouble(scanner.nextLine());
        double pantsPrice = shirtPrice*0.75;
        double socksPrice = pantsPrice*0.20;
        double bootsPrice = (shirtPrice+pantsPrice)*2;

        double totalSum = shirtPrice+pantsPrice+socksPrice+bootsPrice;

        double afterDiscountSum = totalSum-(totalSum*0.15);

        if (afterDiscountSum>=sumForBall){
            System.out.printf("Yes, he will earn the " +
                    "world-cup replica ball!%n");
            System.out.printf("His sum is %.2f lv.",afterDiscountSum);
        }else {
            System.out.printf("No, he will not earn" +
                    " the world-cup replica ball.%n");
            System.out.printf("He needs %.2f lv. " +
                    "more.",sumForBall-afterDiscountSum);
        }

    }
}
