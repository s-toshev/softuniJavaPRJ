package ASSOC_ARRAYS_LAB;

import java.util.*;
import java.util.stream.Collectors;

public class countCharsInAstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        char[] charArr = text.toCharArray();

        Map<Character, Integer> resultMap = new LinkedHashMap<>();

        for (char entry : charArr) {
            if (!resultMap.containsKey(entry)) {
                resultMap.put(entry, 1);
            } else {
                resultMap.put(entry, resultMap.get(entry) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
