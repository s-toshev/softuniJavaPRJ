package _01_ADVANCED_FUNCTIONAL_PR;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class reverseExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numList = Arrays.stream(input
                        .split("\\s+")).mapToInt(
                        Integer::parseInt).boxed()
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());


        Collections.reverse(numList);
        Predicate<Integer> checkDiv = num -> num % n ==0;
        numList.removeIf(checkDiv);

        numList.forEach(num -> System.out.println(num
        + " "));
    }
}
