package WhileLoopExercise00005;

import java.util.Scanner;

public class vacation003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        boolean cantSaveMoney = false;
        double totalMoney = availableMoney;
        int countDays = 0;
        int spendDays = 0;
        while (totalMoney < vacationMoney) {
            countDays++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "save":
                    spendDays = 0;
                    totalMoney = totalMoney + money;
                    break;
                case "spend":
                    spendDays++;
                    totalMoney = totalMoney - money;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }
                    break;
            }
            if (spendDays == 5) {
                cantSaveMoney = true;
                break;
            }
        }
        if (cantSaveMoney) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}