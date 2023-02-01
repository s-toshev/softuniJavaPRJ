package conditionalStatementsExercise;

import java.util.Scanner;

public class bonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startScore = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;
        double totalPoints = startScore+bonusPoints;

        if (startScore<=100) {
            bonusPoints=5;
        }else if (startScore<1000) {
            bonusPoints=startScore*0.2;
        }else bonusPoints=startScore*0.1;
        if (startScore%2==0) {
            bonusPoints=bonusPoints+1;
        }else if (startScore%10==5) {
            bonusPoints=bonusPoints+2;
        }
        System.out.println(bonusPoints);
        System.out.println(totalPoints+bonusPoints);
    }
}
