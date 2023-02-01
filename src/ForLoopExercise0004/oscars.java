package ForLoopExercise0004;

import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName= scanner.nextLine();
        double academyPoints=Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String judgeName= scanner.nextLine();
            double pointsFromJudge=Double.parseDouble(scanner.nextLine());

            int length=judgeName.length();
            double calcPoints=((length*pointsFromJudge)/2);
            academyPoints=academyPoints+calcPoints;

            if(academyPoints>1250.5){
                break;
            }
        }
        if (academyPoints>1250.5){
            System.out.printf("Congratulations, %s " +
                    "got a nominee for leading" +
                    " role with %.1f!",actorName,academyPoints);
        }else {
            System.out.printf("Sorry, %s you" +
                    " need %.1f more!",actorName,1250.5-academyPoints);
        }
    }
}
