package _03Lists_LAB_FUNDAMENTALS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class b_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        int size = numList.size()/2;
        for (int i = 0; i < size; i++) {
           int currentElement = numList.get(i);
           int lastElement = numList.get(numList.size()-1);
           sum = currentElement+lastElement;
           numList.set(i,sum);
           numList.remove(numList.size()-1);
        }

        for (int i = 0; i < numList.size() ; i++) {
            System.out.printf("%d ",numList.get(i));
        }

    }
}
