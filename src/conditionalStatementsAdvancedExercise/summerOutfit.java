package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deg = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String shoes = "";
        String outfit = "";

        if (time.equals("Morning"))
            if (deg <= 18 && deg >= 10) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (deg <= 24 && deg >= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (deg >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        if (time.equals("Afternoon"))
            if (deg <= 18 && deg >= 10) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (deg <= 24 && deg >= 18) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (deg >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        if (time.equals("Evening"))
            if (deg <= 18 && deg >= 10) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (deg <= 24 && deg >= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (deg >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        System.out.printf("It's %d degrees, " +
                "get your %s and %s.",deg,outfit,shoes);
    }
    }
