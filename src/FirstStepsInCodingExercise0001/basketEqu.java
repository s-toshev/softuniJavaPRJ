package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class basketEqu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());

        double boots = yearlyTax-(yearlyTax*0.40);
        double clothes = boots-(boots*0.20);
        double ball = clothes*0.25;
        double accessories = ball*0.20;

        double totalCost = yearlyTax+boots+clothes+ball+accessories;

        System.out.println(totalCost);



    }
}
