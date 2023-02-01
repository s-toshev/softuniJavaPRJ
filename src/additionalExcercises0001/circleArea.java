package additionalExcercises0001;

import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double areaC = r*r*Math.PI;
        double perim = 2*r*Math.PI;

        System.out.printf("%.2f%n%.2f", areaC, perim);
    }
}
