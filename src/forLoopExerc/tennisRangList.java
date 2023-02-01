package forLoopExerc;

import java.util.Scanner;

public class tennisRangList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGames = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int stagePoints = 0;
        int totalPoints = 0;
        int win = 0;
        for (int i = 1; i <=numberGames ; i++) {
            String stage = scanner.nextLine();

            if (stage.equals("F")){
               stagePoints=1200;
               totalPoints=totalPoints+stagePoints;
            }else if (stage.equals("SF")){
                stagePoints=720;
                totalPoints=totalPoints+stagePoints;
            }else if (stage.equals("W")){
                win++;
                stagePoints=2000;
                totalPoints=totalPoints+stagePoints;
            }


        }

        int finalPoints = totalPoints+startingPoints;
        int avgPoints = totalPoints/numberGames;
        double winPercentage = win*1.0/numberGames*100;

        System.out.printf("Final points: %d%n",finalPoints);
        System.out.printf("Average points: %.0f%n",Math.floor(avgPoints));
        System.out.printf("%.2f%%",winPercentage);
    }
}
