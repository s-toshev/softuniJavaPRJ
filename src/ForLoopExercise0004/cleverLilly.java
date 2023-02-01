package ForLoopExercise0004;

import java.util.Scanner;

public class cleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachPrice = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int toyCount=0;
        double money=0;
        double allMoney=0;
        int brother=0;
        for (int i = 1; i <=age ; i++) {

            if (i%2==0){
                money=money+10;
                allMoney=money+allMoney;
                brother++;
            }else {
                toyCount++;
            }


        }
        double toySum = pricePerToy*toyCount;
        double totalMoney=allMoney+toySum-brother;
        double diff = Math.abs(totalMoney-washMachPrice);
        if (totalMoney>=washMachPrice){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
