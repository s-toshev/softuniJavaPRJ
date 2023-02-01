package firstFundMidExamSimeon;

import java.util.Scanner;

public class spaceTravelExamSecondTry {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String input = newScanner.nextLine();

        int fuelForStart = Integer.parseInt(newScanner.nextLine());
        int ammoStart = Integer.parseInt(newScanner.nextLine());

        String[] textArr = input.split("\\|\\|");
        for (int i = 0; i < textArr.length; i++) {
            String[] command = textArr[i].split(" ");
            String text = command[0];
            switch (text) {
                case "Travel":
                    int dist = Integer.parseInt(command[1]);
                    if (fuelForStart >= dist) {
                        System.out.printf("The spaceship travelled %d light-years.%n", dist);
                        fuelForStart -= dist;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;

                case "Enemy":
                    int armorOfEnemy = Integer.parseInt(command[1]);
                    if (ammoStart >= armorOfEnemy) {
                        System.out.printf("An enemy with %d armour is defeated.%n", armorOfEnemy);
                        ammoStart -= armorOfEnemy;
                    } else if ((fuelForStart / 2) >= armorOfEnemy) {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", armorOfEnemy);
                        fuelForStart-=armorOfEnemy*2;
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;

                case "Repair":
                    int repairNumber = Integer.parseInt(command[1]);
                    fuelForStart += repairNumber;
                    ammoStart += repairNumber * 2;
                    System.out.printf("Ammunitions added: %d.%n", repairNumber * 2);
                    System.out.printf("Fuel added: %d.%n", repairNumber);
                    break;

                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    break;

            }
        }


        ///
    }
}
