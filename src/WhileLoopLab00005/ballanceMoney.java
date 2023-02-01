package WhileLoopLab00005;

import java.util.Scanner;

public class ballanceMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalMoney = 0;
        while(!input.equals("NoMoreMoney")){
            double money = Double.parseDouble(input);
            if(money<0){
                System.out.println("Invalid operation!");
                break;
            }
        }

    }
}
