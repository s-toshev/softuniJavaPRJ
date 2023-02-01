package _inTheBegininng;

import java.util.Scanner;

public class tupiJivotni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double totalDog = dogFood*2.50 + catFood*4;

        System.out.println(totalDog + " lv.");
    }
}
