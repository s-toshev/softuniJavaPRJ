package additionalExcercises0001;

import java.util.Scanner;

public class fishMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumriaKg = Double.parseDouble(scanner.nextLine());
        double priceCacaKg = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());

        double palamudPrice = priceSkumriaKg+(priceSkumriaKg*0.60);
        double palamudTotal = palamudPrice*palamudKg;

        double safridPrice = priceCacaKg+(priceCacaKg*0.80);
        double safridTotal = safridPrice*safridKg;

        double midiTotal = midiKg*7.50;

        double totalLv = palamudTotal+safridTotal+midiTotal;

        System.out.printf("%.2f",totalLv);




    }
}
