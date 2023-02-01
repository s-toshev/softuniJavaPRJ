package ASSOC_ARRAYS_LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class countRealNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        TreeMap<Double,Integer> counts = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {

        }


    }
}
