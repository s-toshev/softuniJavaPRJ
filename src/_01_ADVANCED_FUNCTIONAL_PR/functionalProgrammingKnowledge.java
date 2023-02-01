package _01_ADVANCED_FUNCTIONAL_PR;

import java.util.Scanner;
import java.util.function.*;

public class functionalProgrammingKnowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема,връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> ->  get
        //Predicate<приема стойност> -> връща false/true -> test
        //BiFunction<приема1, приема2, връща> -> apply
        Function<Integer, Integer> power2 = number ->
                number * number;

        System.out.println(power2.apply(5));

        Consumer<String> printWord = System.
                out::println;
        printWord.accept("Simeon");

        Supplier<Integer> date = () -> 26122022;
        date.get();
        System.out.println(date.get());

        Predicate<String> isEquals = word -> word
                .endsWith("InTheMix");
        System.out.println(isEquals.test("something"));

        BiFunction<Integer,Double,String> sum = (number1,number2)
        -> String.valueOf(number1+number2);
        System.out.println(sum.apply(5,6.0));


    }
}
