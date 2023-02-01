package ASSOC_ARRAYS_LAB;

import java.util.*;
import java.util.stream.Collectors;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<Integer> numList = Arrays.stream(text.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        TreeMap<Integer, Integer> numMap = new TreeMap<>();

        for (int num : numList) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, numMap.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
