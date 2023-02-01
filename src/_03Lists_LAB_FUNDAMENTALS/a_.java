package _03Lists_LAB_FUNDAMENTALS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size()-1; i++) {
            double currentNum = numList.get(i);
            double nextNum = numList.get(i+1);
            if(currentNum==nextNum){
                numList.set(i,currentNum+nextNum);
                numList.remove(i+1);
                i = -1;
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            System.out.printf("%.0f ",numList.get(i));
        }

    }
}
