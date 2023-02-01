package _01_ADVANCED_STACKS_N_QUEUES_LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String s : symbols) {
            stack.push(s);

            while (stack.size() > 1) {
                int right = Integer.parseInt(stack.pop());
                String operation = stack.pop();
                int left = Integer.parseInt(stack.pop());
                int result = 0;
                if (operation.equals("+")) {
                    result = right + left;
                } else {
                    result = right - left;
                }
                stack.push(String.valueOf(result));
            }
        }
        System.out.println(stack.peek());
    }
}
