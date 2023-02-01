package forLoopExerc;

import java.util.Scanner;

public class cleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int singleToyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        int evenBDaySum = 0;
        int brother = 0;
        int totalMoney = 0;
        for (int i = 1; i <=age ; i++) {
            if(i%2==0){
                evenBDaySum=evenBDaySum+10;
                totalMoney=totalMoney+evenBDaySum;
                brother++;
            }else toyCount++;
        }

        int totalBDayMoney = totalMoney-brother;
        int toyMoney = singleToyPrice*toyCount;

        int totalSavedMoney = totalBDayMoney+toyMoney;

        if(totalSavedMoney>=priceWasher){
            System.out.printf("Yes! %.2f",Math.abs(totalSavedMoney-priceWasher));
        }else System.out.printf("No! %.2f",Math.abs(priceWasher-totalSavedMoney));
    }
}
