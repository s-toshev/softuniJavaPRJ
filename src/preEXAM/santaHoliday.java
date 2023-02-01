package preEXAM;

import java.util.Scanner;

public class santaHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysInHotel = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String ocenka = scanner.nextLine();

        int totalNights = daysInHotel - 1;
        double typeOfNightstayPrice = 0;
        double finalStayPrice = 0;
        double discount = 0;

        if (daysInHotel < 10) {
            if (typeOfRoom.equals("room for one person")) {
                typeOfNightstayPrice=18.00;
            } else if (typeOfRoom.equals("apartment")) {
                discount=0.3;
                typeOfNightstayPrice=25.00;
            } else if (typeOfRoom.equals("president apartment")) {
                discount=0.10;
                typeOfNightstayPrice=35.00;
            }
        } else if (daysInHotel > 10 && daysInHotel <= 15) {
            if (typeOfRoom.equals("room for one person")) {
                typeOfNightstayPrice=18.00;
            } else if (typeOfRoom.equals("apartment")) {
                discount=0.35;
                typeOfNightstayPrice=25.00;
            } else if (typeOfRoom.equals("president apartment")) {
                discount=0.15;
                typeOfNightstayPrice=35.00;
            }
        } else if (daysInHotel > 15) {
            if (typeOfRoom.equals("room for one person")) {
                typeOfNightstayPrice=18.00;
            } else if (typeOfRoom.equals("apartment")) {
                discount=0.50;
                typeOfNightstayPrice=25.00;
            } else if (typeOfRoom.equals("president apartment")) {
                discount=0.2;
                typeOfNightstayPrice=35.00;
            }
        }

        double priceForStay = totalNights*typeOfNightstayPrice;
        double priceWithDiscount = priceForStay-(priceForStay*discount);

        if(ocenka.equals("positive")){
            finalStayPrice=priceWithDiscount+(priceWithDiscount*0.25);
        }else if (ocenka.equals("negative")){
            finalStayPrice=priceWithDiscount-(priceWithDiscount*0.10);
       }

        System.out.printf("%.2f",finalStayPrice);
    }
}
