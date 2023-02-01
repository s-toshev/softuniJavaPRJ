package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class petSh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogNum = Double.parseDouble(scanner.nextLine());
        double catNum = Double.parseDouble(scanner.nextLine());

        double dogTotal = dogNum*2.50;
        double catTotal = catNum*4;

        double totalTotal = dogTotal+catTotal;

        System.out.printf("%.1f lv.",totalTotal);
    }
}
