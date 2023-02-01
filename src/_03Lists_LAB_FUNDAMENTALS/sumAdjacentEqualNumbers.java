package _03Lists_LAB_FUNDAMENTALS;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1; i++) {
            double currentNum = numList.get(i);
            double nextNum = numList.get(i + 1);
            if (currentNum == nextNum) {
                numList.set(i, currentNum + nextNum);
                numList.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(joinElementsByDelimeter(numList," "));

    }

    public static String
    joinElementsByDelimeter (List<Double> list, String delimeter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list ) {
            String numDf = df.format(item) + delimeter;
            result = result+numDf;
        }
        return  result;

    }
}
