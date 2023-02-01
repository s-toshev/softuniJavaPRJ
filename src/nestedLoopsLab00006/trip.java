package nestedLoopsLab00006;

import java.util.Scanner;

public class trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destnation = input;
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum<budget) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum = sum + amount;
            }

            System.out.printf("Going to %s!%n",destnation);

            input = scanner.nextLine();

        }
    }
}