package ForLoopExercise0004;

import java.util.Scanner;

public class tennisRangList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int matchPoints = 0;
        int winCount = 0;
        for (int i = 1; i <= n; i++) {
            String stage = scanner.nextLine();

            if (stage.equals("W")) {
                matchPoints = 2000;
            } else if (stage.equals("F")) {
                matchPoints = 1200;
            } else if (stage.equals("SF")) {
                matchPoints = 720;
            }
            if (stage.equals("W")){
                winCount++;
            }
            totalPoints = totalPoints + matchPoints;
        }

        double finalPoints = totalPoints + startingPoints;
        double percentage = winCount*1.0/n*100;
        System.out.printf("Final points: %.0f%n", finalPoints * 1.0);
        System.out.printf("Average points: %.0f%n", Math.floor(totalPoints * 1.0 / n));
        System.out.printf("%.2f%%",percentage);
    }
}
