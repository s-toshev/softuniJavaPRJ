package FUNDAMENTALSjavaLab222;

import java.util.Scanner;

public class theatrePromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                ticketPrice = 12;
                System.out.printf("%d$",ticketPrice);

            } else if (day.equals("Weekend")) {
                ticketPrice = 15;
                System.out.printf("%d$",ticketPrice);

            } else if (day.equals("Holiday")) {
                ticketPrice = 5;
                System.out.printf("%d$",ticketPrice);

            }else System.out.println("Error!");
        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                ticketPrice = 18;
                System.out.printf("%d$",ticketPrice);

            } else if (day.equals("Weekend")) {
                ticketPrice = 20;
                System.out.printf("%d$",ticketPrice);

            } else if (day.equals("Holiday")) {
                ticketPrice = 12;
                System.out.printf("%d$",ticketPrice);

            }else System.out.println("Error!");
        } else if (age > 64 && age <= 122) {
            if (day.equals("Weekday")) {
                ticketPrice = 12;
                System.out.printf("%d$",ticketPrice);

            } else if (day.equals("Weekend")) {
                ticketPrice = 15;
                System.out.printf("%d$",ticketPrice);

            } else if (day.equals("Holiday")) {
                ticketPrice = 10;
                System.out.printf("%d$",ticketPrice);
            } else System.out.println("Error!");

        }else System.out.println("Error!");
    }
}
