package _03Lists_LAB_FUNDAMENTALS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();

        while (!lineInput.equals("end")) {
            String[] commandArr = lineInput.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(indexRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    numList.add(indexToInsert, numToInsert);
                    break;
            }


            lineInput = scanner.nextLine();
        }
            //става и с фор цикъл да се принтира
        System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
    }
}
