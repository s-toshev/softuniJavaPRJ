package _01_ADVANCED_FUNCTIONAL_PR;

import java.util.List;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = List.of(13, 12, 11, 5);


        ///  numbers.forEach(e -> square(e));

        numbers.stream().map(e -> e * e).forEach(e -> System.out.println(e));


    }
}
