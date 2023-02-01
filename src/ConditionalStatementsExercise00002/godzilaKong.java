package ConditionalStatementsExercise00002;

import java.util.Scanner;

public class godzilaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceClothPerOneStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget*0.10;
        double sumCloth = numberStatists*priceClothPerOneStatist;


        if (numberStatists>150){
            sumCloth=sumCloth-(sumCloth*0.10);
        }

        double movieBudgetTotalCost = decorPrice+sumCloth;

        if(movieBudgetTotalCost>movieBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva" +
                    " more.",movieBudgetTotalCost-movieBudget);
        } else if (movieBudgetTotalCost<=movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f" +
                    " leva left.",movieBudget-movieBudgetTotalCost);
        }



    }
}
