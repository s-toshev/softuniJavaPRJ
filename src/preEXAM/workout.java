package preEXAM;

import java.util.Scanner;

public class workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        int n = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double totalKms=30;
        double dailyKms=0;
        int counterDay=0;
        for (int i = 1; i <=n ; i++) {
            int percentagePerDay=Integer.parseInt(scanner.nextLine());
            counterDay++;
            dailyKms=dailyKms+(dailyKms*(percentagePerDay/100.0));
            totalKms=dailyKms+totalKms;
        }
            double missingKms = 1000-totalKms;

        System.out.println(totalKms);
              //  if (totalKms>=1000){
             //     System.out.printf("You've done a great job running " +
              //            "%f more kilometers!",Math.ceil(totalKms-1000));
            //    }else {
              //      System.out.printf("Sorry Mrs. Ivanova, you need to run" +
             //               " %.0f more kilometers",Math.ceil(missingKms));
             //   }
    }
}
