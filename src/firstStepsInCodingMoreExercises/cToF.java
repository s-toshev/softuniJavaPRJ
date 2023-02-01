package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class cToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = Double.parseDouble(scanner.nextLine());

        double cToF = (c*1.8)+32;
        System.out.printf("%.2f",cToF);
    }
}
