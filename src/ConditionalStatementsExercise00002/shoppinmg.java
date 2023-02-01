package ConditionalStatementsExercise00002;

import java.util.Scanner;

public class shoppinmg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int vgaNum = Integer.parseInt(scanner.nextLine());
        int cpuNum = Integer.parseInt(scanner.nextLine());
        int ramNum = Integer.parseInt(scanner.nextLine());

        double priceVga=vgaNum*250;
        double totalCpuPrice=(priceVga*0.35)*cpuNum;
        double totalRamPrice=(priceVga*0.10)*ramNum;

        double totalSum=priceVga+totalRamPrice+totalCpuPrice;

        if(vgaNum>cpuNum){
            totalSum=totalSum-(totalSum*0.15);
        }

        if (budget>=totalSum){
            System.out.printf("You have %.2f leva left!",budget-totalSum);
        } else if (budget<totalSum)
            System.out.printf("Not enough money! You need" +
                " %.2f leva more!",totalSum-budget);



    }
}
