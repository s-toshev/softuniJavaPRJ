package preEXAM;

import java.util.Scanner;

public class hairSaloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayTarget = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int income = 0;
        boolean isDone = false;
        while (!input.equals("closed") || income == dayTarget) {
            String typeOfService = input;
            String menLadiesKidTouchFull = scanner.nextLine();

            if (typeOfService.equals("haircut")) {
                if (menLadiesKidTouchFull.equals("mens")) {
                    income = income + 15;
                } else if (menLadiesKidTouchFull.equals("ladies")) {
                    income = income + 20;
                } else if (menLadiesKidTouchFull.equals("kids")) {
                    income = income + 10;
                }
            } else if (typeOfService.equals("color")) {
                if (menLadiesKidTouchFull.equals("touch up")) {
                    income = income + 20;
                } else if (menLadiesKidTouchFull.equals("full color")) {
                    income = income + 30;
                }
            }

                if (income==dayTarget){
                    isDone=true;
                    break;
                }

                input = scanner.nextLine();

            }

        if (isDone) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %dlv.",income);
        } else {
            System.out.printf("Target not reached! You need" +
                    " %dlv. more.%n", dayTarget - income);
            System.out.printf("Earned money: %dlv.",income);
        }
    }
}