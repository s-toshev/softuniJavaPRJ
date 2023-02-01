package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartmentPrice = 0;
        double studioPrice = 0;
        double totalApart = 0;
        double totalStudio = 0;

        switch (month) {
            case "May":
            case "October":
                apartmentPrice=65;
                studioPrice=50;
                break;
            case "June":
            case "September":
                apartmentPrice=75.20;
                studioPrice=68.70;
                break;
            case "July":
            case "August":
                apartmentPrice=76;
                studioPrice=77;
                break;
        }

        if (nights>7 && nights<14 && month.equals("May")
                || month.equals("October")) {
            studioPrice=studioPrice-(studioPrice*0.05);
            totalStudio=studioPrice*nights;
            totalApart=nights*apartmentPrice;

        } else if (nights>14 && month.equals("May")
                || month.equals("October")) {
            studioPrice=studioPrice-(studioPrice*0.30);
            totalStudio=studioPrice*nights;
            totalApart=nights*apartmentPrice;

        }else if (nights>14 && month.equals("June")
                || month.equals("September")) {
            studioPrice=studioPrice-(studioPrice*0.20);
            totalStudio=studioPrice*nights;
        } else if (nights>14) {
            apartmentPrice=apartmentPrice-(apartmentPrice*0.10);
            totalApart=nights*apartmentPrice;
        }

        System.out.printf("Apartment: %.2f lv. \nStudio: %.2f lv.",totalApart,totalStudio);
    }
}
