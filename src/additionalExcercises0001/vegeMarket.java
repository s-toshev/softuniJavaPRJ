package additionalExcercises0001;

import java.util.Scanner;

public class vegeMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int totalKgVege = Integer.parseInt(scanner.nextLine());
        int totalKgFruit = Integer.parseInt(scanner.nextLine());

        double costVege = vegPrice*totalKgVege;
        double costFruit = fruitPrice*totalKgFruit;

        double totalInLv = costFruit+costVege;

        double totalInEur = totalInLv/1.94;

        System.out.printf("%.2f",totalInEur);


    }
}
