package ASSOC_ARRAYS_LAB;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()){
            if(!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol, 1);
            }else{
                int currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol,currentCount+1);
            }
        }

        symbolCount.forEach((key, value) -> System.out.println(key +
                " -> " + value));

    }
}
