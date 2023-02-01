package ASSOC_ARRAYS_LAB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test___ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> kravarnik = new HashMap<>();
        kravarnik.put("Krava", 18);
        kravarnik.put("mlqko", 70);
        kravarnik.put("koza", 33);
        kravarnik.put("selo", 134);

        kravarnik.remove("selo");

        if(kravarnik.containsKey("Krava")){
            System.out.println("mlqko");
        }

        if(kravarnik.containsValue(33)){
            System.out.println("ly ly ly ly");
        }

        for (Map.Entry<String, Integer>
                stringIntegerEntry : kravarnik.entrySet()) {
            System.out.printf("%s ----> %d%n",stringIntegerEntry.getKey(),
                    stringIntegerEntry.getValue());
        }


    }
}
