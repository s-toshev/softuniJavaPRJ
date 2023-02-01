package _01FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            int currentnum = i;
            int sum = 0;
            while(currentnum>0){
                sum = sum + (currentnum%10);
                currentnum=currentnum/10;
            }

            if(sum==5||sum==7||sum==11){
                System.out.printf("%d -> True%n",i);
            }else{
                System.out.printf("%d -> False%n",i);
            }

        }

    }
}
