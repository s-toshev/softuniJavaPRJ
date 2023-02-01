package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class hiName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.printf("Hello, %s!",name);
    }
}
