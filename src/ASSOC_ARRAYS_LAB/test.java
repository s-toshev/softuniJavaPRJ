package ASSOC_ARRAYS_LAB;

import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap <String,Integer> airplanesMap = new HashMap<>();
        airplanesMap.put("Krava",112);
        airplanesMap.put("Koza",911);

        airplanesMap.remove("Koza");

        if(airplanesMap.containsKey("Krava")){
            System.out.println(airplanesMap);
        }else{
            System.out.println("No Krava");
        }

    }
}
