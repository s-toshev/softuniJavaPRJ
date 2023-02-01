package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class conc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String familyName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.println("You are " + name + " " + familyName
        + ", a " + age + "-years old person from " + city
        + ".");
    }
}
