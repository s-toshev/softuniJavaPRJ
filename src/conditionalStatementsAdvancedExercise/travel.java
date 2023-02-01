package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String typeOfHouse = "";

        double moneySpent = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneySpent = budget * 0.30;
                typeOfHouse = "Camp";
            } else if (season.equals("winter")) {
                moneySpent = budget * 0.70;
                typeOfHouse = "Hotel";
            }
        } else if (budget <= 1000 && budget > 100) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = budget * 0.40;
                typeOfHouse = "Camp";
            } else if (season.equals("winter")) {
                moneySpent = budget * 0.80;
                typeOfHouse = "Hotel";
            }
        }else if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                moneySpent = budget * 0.90;
                typeOfHouse = "Hotel";
            }
        }
            System.out.printf("Somewhere in %s " +
                    "\n%s - %.2f", destination,typeOfHouse,moneySpent);


        }
    }
