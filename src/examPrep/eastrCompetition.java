package examPrep;

import java.util.Scanner;

public class eastrCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int maxPoints = Integer.MIN_VALUE;
        String winnerName = "";
        for (int i = 0; i < easterBreadCount; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine();
            int totalPoints=0;
            while(!input.equals("Stop")){
                int currentPoint = Integer.parseInt(input);
                totalPoints=totalPoints+currentPoint;

                input= scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n",name,totalPoints);

            if(totalPoints>maxPoints){
                maxPoints=totalPoints;
                winnerName=name;
                System.out.printf("%s is the new number 1!%n",name);
            }

        }
        System.out.printf("%s won competition with %d points!",winnerName,maxPoints);

    }
}
