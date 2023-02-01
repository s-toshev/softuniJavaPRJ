package ConditionalStatementsAdvancedLab0003;

import java.util.Scanner;

public class tradeCommision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());

       /// boolean isCity= city.equals("Sofia")||city.equals("Varna")
          ///      ||city.equals("Plovdiv");


        boolean isValid=true;

        double commission = 0;

        if (city.equals("Sofia")){
            if(qty>=0&&qty<=500){
                commission=0.05;
            }else if(qty>500&&qty<=1000){
                commission=0.07;
            }else if(qty>1000&&qty<=10000){
                commission=0.08;
            }else if(qty>10000){
                commission=0.12;
            }else isValid=false;
        }
        else if (city.equals("Varna")){
            if(qty>=0&&qty<=500){
                commission=0.045;
            }else if(qty>500&&qty<=1000){
                commission=0.075;
            }else if(qty>1000&&qty<=10000){
                commission=0.10;
            }else if(qty>10000){
                commission=0.13;
            }else isValid=false;
        }
        else if (city.equals("Plovdiv")) {
            if (qty >= 0 && qty <= 500) {
                commission = 0.055;
            } else if (qty > 500 && qty <= 1000) {
                commission = 0.08;
            } else if (qty > 1000 && qty <= 10000) {
                commission = 0.12;
            } else if (qty > 10000) {
                commission = 0.145;
            } else isValid = false;
        }
        else isValid=false;

        if(isValid){
            double total=commission*qty;
            System.out.printf("%.2f",total);
        }else System.out.println("error");
    }
}
