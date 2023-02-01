package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class fishMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());

        double midiPrice = midiKg*7.50;
        double palamudPrice = priceSkumriq+(priceSkumriq*0.6);
        double safridPrice = priceCaca+(priceCaca*0.8);

        double totalPrice = midiPrice+palamudPrice+safridPrice;

        System.out.printf("%.2f",totalPrice);

    }
}
