package whileLoopExerc2nd;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countDaysSpend = 0;
        int countDaysSave = 0;
        double totalMoney = availableMoney;
        while (totalMoney < moneyNeeded) {
            String action = scanner.nextLine();
            double sumSpendSave = Double.parseDouble(scanner.nextLine());
            if (totalMoney < 0) {
                totalMoney = 0;
            }
            if (action.equals("spend")) {
                totalMoney = totalMoney - sumSpendSave;
                countDaysSpend++;
            } else if (action.equals("save")) {
                totalMoney = totalMoney + sumSpendSave;
                countDaysSave++;
            }

            if (countDaysSpend == 5) {
                break;
            }
        }
        if (countDaysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDaysSpend);
        } else
            System.out.printf("You saved the money" +
                    " for %d days.", countDaysSave + countDaysSpend);
    }
}
