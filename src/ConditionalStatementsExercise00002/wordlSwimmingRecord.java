package ConditionalStatementsExercise00002;

import java.util.Scanner;

public class wordlSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double lenghtMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double totalSec=lenghtMeters*timeInSeconds;
        double timeLost=Math.floor(lenghtMeters/15)*12.5;
        double totalTime=totalSec+timeLost;

        if (totalTime<recordSec){
            System.out.printf("Yes, he succeeded! The new world " +
                    "record is %.2f seconds.",totalTime);
        }else if (totalTime>=recordSec){
            System.out.printf("No, he failed! He was %.2f" +
                    " seconds slower.",totalTime-recordSec);
        }

    }
}
