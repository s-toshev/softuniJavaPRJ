package ASSOC_ARRAYS_LAB;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,ArrayList<String>> sMap = new LinkedHashMap<>();

        String word = "";
        String synonym = "";
        for (int i = 0; i < n; i++) {
            word = scanner.nextLine();
            synonym = scanner.nextLine();
            sMap.putIfAbsent(word,new ArrayList<>());
            sMap.get(word).add(synonym);

        }

        for (Map.Entry<String, ArrayList<String>> entry : sMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(
                    ", ", entry.getValue()));
        }


    }
}
