package _03Lists_LAB_FUNDAMENTALS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //за всеки елемент 'е', ако е по-малък от 0 , го премахни
        numList.removeIf(e -> e <0);

        Collections.reverse(numList);

        if(numList.size() == 0){
            System.out.println("empty");
        } else {
            System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
