package forLoopExerc;

import java.util.Scanner;

public class oscars6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int nJury = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=nJury ; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            int length=juryName.length();
            double calcPoints=((length*juryPoints)/2);
            academyPoints=academyPoints+calcPoints;

            if(academyPoints>1250.5){
                break;
            }
        }

        if (academyPoints>1250.5){
            System.out.printf("Congratulations, %s " +
                    "got a nominee for leading role with %.1f!",actorName,academyPoints);
        }else System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5-academyPoints);

    }
}
