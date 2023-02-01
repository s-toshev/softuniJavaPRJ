package _03Lists_LAB_FUNDAMENTALS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class c_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();


        int smallerList = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < smallerList; i++) {
            int flElement = firstList.get(i);
            int slElement = secondList.get(i);
            resultList.add(flElement);
            resultList.add(slElement);
        }

        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(smallerList, firstList.size()));
        } else if (secondList.size() > firstList.size()) {
            resultList.addAll(secondList.subList(smallerList, secondList.size()));
        }


        for (int i = 0; i < resultList.size(); i++) {
            System.out.printf("%d ", resultList.get(i));
        }

    }
}
