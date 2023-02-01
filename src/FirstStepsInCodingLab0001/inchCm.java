package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class inchCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double cm = a * 2.54;

        System.out.println(cm);
    }
}
