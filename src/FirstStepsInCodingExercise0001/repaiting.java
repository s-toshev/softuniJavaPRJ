package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class repaiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plasticKvm = Integer.parseInt(scanner.nextLine());
        int paintL = Integer.parseInt(scanner.nextLine());
        int detergentL = Integer.parseInt(scanner.nextLine());
        int timeToComplete = Integer.parseInt(scanner.nextLine());

        double plasticPrice = (plasticKvm+2)*1.50;
        double paintPrice = (paintL+(paintL*0.1))*14.50;
        double detPrice = detergentL*5;
        double bagSum = 0.40;

        double totalMaterials = plasticPrice+paintPrice+detPrice+bagSum;
        double workersSum = (totalMaterials*0.3)*timeToComplete;

        double endSum = totalMaterials+workersSum;

        System.out.println(endSum);

    }
}
