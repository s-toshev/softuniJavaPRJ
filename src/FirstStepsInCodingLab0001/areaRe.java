package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class areaRe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int c = a*b;

        System.out.println(c);
    }
}
