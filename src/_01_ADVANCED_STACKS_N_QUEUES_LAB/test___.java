package _01_ADVANCED_STACKS_N_QUEUES_LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class test___ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int element1 = 1;
        int element2 = 3;
        int element3 = 3;

        stack.push(element1);
        stack.push(element2);
        stack.push(element3);

        element2 = stack.pop();

        int size = stack.size();

        boolean exist = stack.contains(3);
        boolean isEmpty = stack.isEmpty();


        System.out.println(isEmpty);
        System.out.println(exist);
        System.out.println(size);
    }
}
