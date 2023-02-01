package ConditionalStatementsExercise00002;

import java.util.Scanner;

public class bonusP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPoints = Integer.parseInt(scanner.nextLine());

        double bP = 0;

        if(startPoints<=100){
            bP=5;
        }else if (startPoints<1000){
            bP=startPoints*0.2;
        }else {
            bP=startPoints*0.10;
        }

        if (startPoints%2==0){
            bP=bP+1;
        }else if (startPoints%10==5){
            bP=bP+2;
        }
        System.out.println(bP);
        System.out.println(startPoints+bP);
    }
}
