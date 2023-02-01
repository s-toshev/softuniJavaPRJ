package WhileLoopLab00005;

import java.util.Scanner;

public class accountBallance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalMoney = 0;
        while(!input.equals("NoMoreMoney")){
            double money =Double.parseDouble(input);
            if(money<0){
                System.out.println("Invalid operaton!");
                break;
            }
            System.out.printf("Increase: %.2f%n",money);
            totalMoney=totalMoney+money;

            input= scanner.nextLine();

        }
        System.out.printf("Total: %.2f%n",totalMoney);
    }
}
