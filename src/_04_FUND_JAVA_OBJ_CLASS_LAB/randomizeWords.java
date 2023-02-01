package _04_FUND_JAVA_OBJ_CLASS_LAB;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] textArr = input.split(" ");

        Random generator = new Random();

        for (int i = 0; i < textArr.length; i++) {
            int indexX = generator.nextInt(textArr.length);
            int indexY = generator.nextInt(textArr.length);

            String oldWordX = textArr[indexX];
            textArr[indexX] = textArr[indexY];
            textArr[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(),textArr));
    }
}
