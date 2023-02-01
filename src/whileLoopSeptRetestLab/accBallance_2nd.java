package whileLoopSeptRetestLab;

import java.util.Scanner;

public class accBallance_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accInput = scanner.nextLine();

        double sum = 0;
        while (!accInput.equals("NoMoreMoney")) {
            double currentMoney = Double.parseDouble(accInput);

            if (currentMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", currentMoney);

            sum = sum + currentMoney;

            accInput = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", sum);
    }
}
