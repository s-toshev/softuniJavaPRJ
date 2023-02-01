package _01FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.io.IOException;
import java.util.Scanner;

public class charToStr {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char three = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",one,two,three);

    }
}
