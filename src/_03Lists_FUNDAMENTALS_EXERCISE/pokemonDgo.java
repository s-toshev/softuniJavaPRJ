package _03Lists_FUNDAMENTALS_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sumRemoved = 0;
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbers.size() - 1) {
                int removedIndex = numbers.get(index);
                sumRemoved=sumRemoved+removedIndex;
                        numbers.remove(index);
                for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
                    int currentNum = numbers.get(indexInList);
                    if (currentNum <= removedIndex) {
                        currentNum = currentNum + removedIndex;
                    } else {
                        currentNum = currentNum - removedIndex;
                    }
                    numbers.set(indexInList, currentNum);
                }

            } else if (index < 0) {
                int firstElement = numbers.get(0);
                numbers.remove(0);
                int lastElement = numbers.get(numbers.size() - 1);
                sumRemoved=sumRemoved+firstElement;
                numbers.add(0, lastElement);
                for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
                    int currentNum = numbers.get(indexInList);
                    if (currentNum <= firstElement) {
                        currentNum = currentNum + firstElement;
                    } else {
                        currentNum = currentNum - firstElement;
                    }
                    numbers.set(indexInList, currentNum);
                }
            } else if (index > numbers.size() - 1) {
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                sumRemoved=sumRemoved+lastElement;
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
                    int currentNum = numbers.get(indexInList);
                    if (currentNum <= lastElement) {
                        currentNum = currentNum + lastElement;
                    } else {
                        currentNum = currentNum - lastElement;
                    }
                    numbers.set(indexInList, currentNum);
                }
            }
        }

        System.out.println(sumRemoved);

    }
}
