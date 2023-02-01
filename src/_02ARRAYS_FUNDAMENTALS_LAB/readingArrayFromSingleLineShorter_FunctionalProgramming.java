package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class readingArrayFromSingleLineShorter_FunctionalProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2 5 55 30 -1 59 20 1
        String text = scanner.nextLine();

        int[] numbersArr = Arrays.stream(text.split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //принтиране на конзолата с цикъл,
        //за да може да се извърти всеки елемент

        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("%d -> %d%n",i,numbersArr[i]);
        }
    }
}
