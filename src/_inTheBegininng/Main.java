package _inTheBegininng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        double age = Double.parseDouble(text);

        System.out.println(age*10);
    }
}