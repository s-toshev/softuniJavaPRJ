package _inTheBegininng;

import java.util.Scanner;

public class ConcData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.println("You are " + firstname + " " + lastname + "," + "a " + age + "-years old person from " + town);
    }
}
