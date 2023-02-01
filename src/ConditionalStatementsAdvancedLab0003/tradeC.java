package ConditionalStatementsAdvancedLab0003;

import java.util.Scanner;

public class tradeC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double saleVol = Double.parseDouble(scanner.nextLine());

        double tradeCommission = 0;

        if (city.equals("Sofia")){
            if (saleVol>=0&&saleVol<=500){
                tradeCommission=saleVol*0.05;
                System.out.printf("%.2f",tradeCommission);
            } else if (saleVol>500&&saleVol<=1000){
                tradeCommission=saleVol*0.07;
                System.out.printf("%.2f",tradeCommission);
            }else if (saleVol>1000&&saleVol<=10000){
                tradeCommission=saleVol*0.08;
                System.out.printf("%.2f",tradeCommission);
            }else if (saleVol>10000){
                tradeCommission=saleVol*0.12;
                System.out.printf("%.2f",tradeCommission);
            }else  System.out.println("error");
        } else if (city.equals("Varna")){
            if (saleVol>=0&&saleVol<=500){
                tradeCommission=saleVol*0.045;
                System.out.printf("%.2f",tradeCommission);
            } else if (saleVol>500&&saleVol<=1000){
                tradeCommission=saleVol*0.075;
                System.out.printf("%.2f",tradeCommission);
            }else if (saleVol>1000&&saleVol<=10000){
                tradeCommission=saleVol*0.10;
                System.out.printf("%.2f",tradeCommission);
            }else if (saleVol>10000){
                tradeCommission=saleVol*0.13;
                System.out.printf("%.2f",tradeCommission);
            }else System.out.println("error");
        }else if (city.equals("Plovdiv")){
            if (saleVol>=0&&saleVol<=500){
                tradeCommission=saleVol*0.055;
                System.out.printf("%.2f",tradeCommission);
            } else if (saleVol>500&&saleVol<=1000){
                tradeCommission=saleVol*0.08;
                System.out.printf("%.2f",tradeCommission);
            }else if (saleVol>1000&&saleVol<=10000){
                tradeCommission=saleVol*0.12;
                System.out.printf("%.2f",tradeCommission);
            }else if (saleVol>10000){
                tradeCommission=saleVol*0.145;
                System.out.printf("%.2f",tradeCommission);
            }else System.out.println("error");
        }else System.out.println("error");

    }
}
