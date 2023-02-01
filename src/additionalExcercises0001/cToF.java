package additionalExcercises0001;

import java.util.Scanner;

public class cToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double farenheit = celsius*1.8+32;

        System.out.printf("%.2f",farenheit);


    }
}
