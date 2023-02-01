package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class vegeMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kgVegetableP = Double.parseDouble(scanner.nextLine());
        double kgFruitsP = Double.parseDouble(scanner.nextLine());
        int totalKgVegetable = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double vegetableCostLv = kgVegetableP*totalKgVegetable;
        double fruitsCostLv = kgFruitsP*totalKgFruits;

        double totalCostInEur = (vegetableCostLv+fruitsCostLv)/1.94;

        System.out.printf("%.2f",totalCostInEur);
    }
}
