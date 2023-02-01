package _03Lists_FUNDAMENTALS_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperators04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numToAdd);
            } else if (command.contains("Insert")) {

                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                if (isValidIndex(position,numbers)){
                    numbers.add(position,element);
                }else{
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                    int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                    if(isValidIndex(indexToRemove,numbers)) {
                        numbers.remove(indexToRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
            } else if (command.contains("Shift left")) {
                    int countShiftLeft = Integer.parseInt(command.split(" ")[2]);
                for (int time = 1; time <=countShiftLeft ; time++) {
                    int firstNum = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNum);
                }
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <=countShiftRight ; i++) {
                    int lastNum = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,lastNum);
                }
            }
            command = scanner.nextLine();
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }
    public static boolean isValidIndex (int index, List<Integer> numbers){
       return index >= 0 && index <=numbers.size()-1;
    }
}

