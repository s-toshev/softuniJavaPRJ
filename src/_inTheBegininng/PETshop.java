package _inTheBegininng;

import java.util.Scanner;

public class PETshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDog = Integer.parseInt(scanner.nextLine());
        int countCat = Integer.parseInt(scanner.nextLine());

        double total = (countDog * 2.5) + (countCat * 4);

        System.out.print(total + " lv.");
    }
}
