package _inTheBegininng;

import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plasticKvM = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int timeToComplete = Integer.parseInt(scanner.nextLine());

        double totalPlastic = (plasticKvM+2)*1.50;
        double totalPaint = (paintLiters+(paintLiters*0.1))*14.50;
        double totalThinner = thinnerLiters*5.00;
        double totalPlasticBag = 0.40;
        double totalMaterials = totalPlastic+totalPaint+totalThinner+totalPlasticBag;
        double totalExpencesForWorkers = (totalMaterials*0.3)*timeToComplete;
        double totalExpences = totalMaterials+totalExpencesForWorkers;

        System.out.println(totalExpences);

    }
}