package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int numberFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalCost =0;

        if (typeFlower.equals("Roses"))
            if (numberFlower>80) {
                totalCost=(numberFlower*5)-((numberFlower*5)*0.10);
            } else totalCost=(numberFlower*5);
        if (typeFlower.equals("Dahlias"))
            if (numberFlower>90) {
                totalCost=(numberFlower*3.80)-((numberFlower*3.80)*0.15);
            } else totalCost=(numberFlower*3.80);
        if (typeFlower.equals("Tulips"))
            if (numberFlower>80) {
                totalCost=(numberFlower*2.80)-((numberFlower*2.80)*0.15);
            } else totalCost=(numberFlower*2.80);
        if (typeFlower.equals("Narcissus"))
            if (numberFlower<120) {
                totalCost=(numberFlower*3)+((numberFlower*3)*0.15);
            } else totalCost=(numberFlower*3);
        if (typeFlower.equals("Gladiolus"))
            if (numberFlower<80) {
                totalCost=(numberFlower*2.50)+((numberFlower*2.50)*0.20);
            } else totalCost=(numberFlower*2.50);

        if (totalCost>budget) {
            System.out.printf("Not enough money, " +
                    "you need %.2f leva more.",totalCost-budget);
        }else System.out.printf("Hey, you have a great garden with" +
                " %d %s and" +
                " %.2f leva left.",numberFlower,typeFlower,budget-totalCost);

    }
}
