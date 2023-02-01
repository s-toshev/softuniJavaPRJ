package ASSOC_ARRAYS_LAB;

import java.util.*;
import java.util.stream.Collectors;

public class oddOc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        String[] listText = text.split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : listText) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);

        }

        List<String> wordsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                wordsList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", wordsList));

    }
}
