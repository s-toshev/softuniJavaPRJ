package _inTheBegininng;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegeMenu = Integer.parseInt(scanner.nextLine());
        double totalwoDesert = countChicken*10.35+countFishMenu*12.40+countVegeMenu*8.15;
        double orderPrice = totalwoDesert+(totalwoDesert*20/100)+2.50;
        System.out.println(orderPrice);
    }
}
