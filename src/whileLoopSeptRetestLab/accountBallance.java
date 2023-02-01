package whileLoopSeptRetestLab;

import java.util.Scanner;

public class accountBallance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        double money = 0;
        double totalM = 0;
        while (!inputLine.equals("NoMoreMoney")){
            money = Double.parseDouble(inputLine);
            if(money<0){
                System.out.println("Invalid Operation!");
                break;
            }
            totalM=totalM+money;
            System.out.printf("Increase: %.2f%n", money);
            inputLine= scanner.nextLine();


        }
        System.out.printf("Total: %.2f%n", totalM);

    }
}
