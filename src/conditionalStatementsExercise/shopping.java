package conditionalStatementsExercise;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double gpuPrice = gpu*250;
        double cpuPrice = cpu*(gpuPrice*0.35);
        double ramPrice = ram*(gpuPrice*0.10);

        double totalPrice = gpuPrice+cpuPrice+ramPrice;

        if (gpu>cpu) {
            totalPrice=totalPrice-(totalPrice*0.15);
        }
        if (budget>=totalPrice) {
            System.out.printf("You have %.2f " +
                    "leva left!",budget-totalPrice);
        } else {
            System.out.printf("Not enough money! You need" +
                    " %.2f leva more!",totalPrice-budget);
        }
    }
}
