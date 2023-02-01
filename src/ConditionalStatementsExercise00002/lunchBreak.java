package ConditionalStatementsExercise00002;

import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int episodeLength=Integer.parseInt(scanner.nextLine());
        int breakLength=Integer.parseInt(scanner.nextLine());

        double lunchTime=breakLength*0.125;
        double breakTime=breakLength*0.25;
        double remainingTime=breakLength-lunchTime-breakTime;
        //math.ceil - закръгляне нагоре

        if (remainingTime>=episodeLength){
            System.out.printf("You have enough time to watch " +
                    "%s and left with " +
                    "%.0f minutes free time.",movieName,Math.ceil(remainingTime-episodeLength));
        }else if (remainingTime<episodeLength){
            System.out.printf("You don't have enough time to watch " +
                    "%s, you need " +
                    "%.0f more minutes.",movieName,Math.ceil(episodeLength-remainingTime));
        }

    }
}
