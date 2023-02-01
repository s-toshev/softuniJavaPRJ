package FUNDAMENTALSjavaLab222;

import java.util.Scanner;

public class backIn30Mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutes + 30;
        int totalHours = hours;


        if (totalMinutes > 59) {
            totalHours = hours + 1;
            totalMinutes = totalMinutes - 60;
        }

        if (totalHours >= 23) {
            totalHours = 0;
        }

        System.out.printf("%d:%02d", totalHours, totalMinutes);
    }
}
