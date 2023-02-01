package __basicSyntacsCstatementsLoopsLAB_;

import java.util.Scanner;

public class backIn30min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesPlus30 = minutes + 30;

        if (minutesPlus30 > 59) {
            hours = hours + 1;
            minutesPlus30 = minutesPlus30 - 60;
        }

        if (hours > 23) {
            hours = 0;
        }

        if(minutesPlus30<10){
            System.out.printf("%d:%02d",hours,minutesPlus30);
        }else{
            System.out.printf("%d:%d",hours,minutesPlus30);
        }

    }
}
