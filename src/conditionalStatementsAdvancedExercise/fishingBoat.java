package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;
        if (season.equals("Spring"))
            if (fishermen <= 6) {
                totalCost = 3000 - (3000 * 0.10);
            } else if (fishermen >= 7 && fishermen <= 11) {
                totalCost = 3000 - (3000 * 0.15);
            } else if (fishermen > 12) {
                totalCost = 3000 - (3000 * 0.25);
            }
        if (season.equals("Summer") || season.equals("Autumn"))
            if (fishermen <= 6) {
                totalCost = 4200 - (4200 * 0.10);
            } else if (fishermen >= 7 && fishermen <= 11) {
                totalCost = 4200 - (4200 * 0.15);
            } else if (fishermen > 12) {
                totalCost = 4200 - (4200 * 0.25);
            }
        if (season.equals("Winter"))
            if (fishermen <= 6) {
                totalCost = 2600 - (2600 * 0.10);
            } else if (fishermen >= 7 && fishermen <= 11) {
                totalCost = 2600 - (2600 * 0.15);
            } else if (fishermen > 12) {
                totalCost = 2600 - (2600 * 0.25);
            }
        if (fishermen%2==0 && !(season.equals("Autumn"))) {
            totalCost=totalCost-(totalCost*0.05);
        }
        if (totalCost>budget) {
            System.out.printf("Not enough money! You need " +
                    "%.2f leva.",totalCost-budget);
        }else System.out.printf("Yes! You have" +
                " %.2f leva left.",budget-totalCost);
    }
}
