package _inTheBegininng;

import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyCost = Integer.parseInt(scanner.nextLine());

        double basketShoes = yearlyCost - (yearlyCost*0.4);
        double basketEquipment = basketShoes - (basketShoes*0.2);
        double basketBall = basketEquipment - (basketEquipment*0.75);
        double basketAccessories = basketBall - (basketBall*0.8);

        double totalCostForTrainings = yearlyCost+basketAccessories+basketBall+basketEquipment
                +basketShoes;
        System.out.println(totalCostForTrainings);
    }
}
