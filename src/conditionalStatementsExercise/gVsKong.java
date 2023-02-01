package conditionalStatementsExercise;

import java.util.Scanner;

public class gVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudged = Double.parseDouble(scanner.nextLine());
        int numberEmployee = Integer.parseInt(scanner.nextLine());
        double priceEmployeeCloth = Double.parseDouble(scanner.nextLine());

        double decor = movieBudged*0.10;

        double totalClothingPrice = priceEmployeeCloth*numberEmployee;
        if(numberEmployee>150) {
            totalClothingPrice=totalClothingPrice-(totalClothingPrice*0.10);        }

        double totalMoviePrice = decor+totalClothingPrice;


        if (totalMoviePrice<=movieBudged) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with" +
                    " %.2f leva left.",movieBudged-totalMoviePrice);

        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",
                    totalMoviePrice-movieBudged);
        }
    }
}
