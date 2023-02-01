package _01FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.util.Scanner;

public class tonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population " +
                "of %d and area %d square km.",city,population,area);
    }
}
