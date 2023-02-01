package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class depoCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double glp = Double.parseDouble(scanner.nextLine());

        double total = sum+months*((sum*glp/100)/12);

        System.out.println(total);


    }
}
