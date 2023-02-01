package preEXAM;

import java.util.Scanner;

public class workout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double firstDay = Double.parseDouble(scanner.nextLine());

        double totalKms = firstDay;
        for (int i = 0; i < n; i++) {
            double nextDays = Double.parseDouble(scanner.nextLine());
            firstDay=firstDay+firstDay*(nextDays/100);
            totalKms+=firstDay;
        }
        if (totalKms>=1000){
            System.out.printf("You've done a great job running %.0f more" +
                    " kilometers!",Math.ceil(totalKms-1000));
        }else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run " +
                    "%.0f more kilometers",(Math.ceil(1000-totalKms)));
        }
    }
}
