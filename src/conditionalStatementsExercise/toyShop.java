package conditionalStatementsExercise;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int numberPuzzle = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = numberPuzzle*2.60+
                talkingDoll*3+teddyBear*4.10+minions*8.20+trucks*2;
        int numberOfToys = numberPuzzle+talkingDoll+teddyBear+
                minions+trucks;
        double endPrice = 0;
        if (numberOfToys>50) {
            endPrice=sum-(sum*0.25);
        }else if (endPrice<50) {
            endPrice=sum;
        }
        double lease = endPrice*0.10;
        double profit = endPrice-lease;
        if (profit>excursionPrice) {
            System.out.printf("Yes! %.2f lv left.",profit-excursionPrice);
        } else System.out.printf("Not enough money! %.2f lv needed.",excursionPrice-profit);
    }

}
