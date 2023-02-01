package _03Lists_LAB_FUNDAMENTALS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class g_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        // numList.removeIf(e -> e < 0);
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) < 0) {
                numList.remove(numList.get(i));
                i=-1;
            }
        }


        Collections.reverse(numList);
        if (numList.size() == 0) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < numList.size(); i++) {
                System.out.printf("%d ", numList.get(i));
            }
        }

    }
}
