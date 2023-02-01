package _03Lists_LAB_FUNDAMENTALS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Maria");
        names.add("Georgi");

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }

    }
}
