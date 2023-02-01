package _03Lists_LAB_FUNDAMENTALS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test____ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> names = new ArrayList<>();

        names.add("Krava");
        names.add("Vegan");
        names.add(0, "Kravari");

        names.remove(1);
        names.set(0, "Krava");
        for (int i = 0; i <names.size() ; i++) {
           if(names.contains("Krava")) {
               System.out.println(names.get(i));
           }else {
               System.out.println("Error");
               break;
           }
        }
    }
}
