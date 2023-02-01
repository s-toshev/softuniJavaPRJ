package _03Lists_LAB_FUNDAMENTALS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class d_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]){
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numList.add(numberToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(tokens[1]);
                    numList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numList.add(indexToInsert,numToInsert);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(numList.toString()
                .replaceAll("[\\[\\],]", ""));

    }
}
