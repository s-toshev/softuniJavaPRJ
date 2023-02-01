package preEXAM;

import java.util.Scanner;

public class catDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbsPercentage = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());

        double fatTotalGr = (totalCalories*(fatPercentage/100.0))/9;
        double proteinTotalGr=(totalCalories*(proteinPercentage/100.0))/4;
        double carbsTotalGr = (totalCalories*(carbsPercentage/100.0))/4;

        double totalFoodWeight = fatTotalGr+proteinTotalGr+carbsTotalGr;

        double caloriesPerGram = totalCalories/totalFoodWeight;

        double kkalWithoutWater = caloriesPerGram-(caloriesPerGram*(waterPercentage/100.0));

        System.out.printf("%.4f",kkalWithoutWater);

    }
}
