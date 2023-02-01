package _01_ADVANCED_STACKS_N_QUEUES_LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int nTurns = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> childrenQueue = new ArrayDeque<>();
        for (int i = 0; i < children.length; i++) {
            childrenQueue.offer(children[i]);
        }

        while(childrenQueue.size()!=1){
            for (int i = 1; i < nTurns; i++) {
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);
            }
            String childToRemove = childrenQueue.poll();
            System.out.println("Removed " + childToRemove);
        }
        String lastChild = childrenQueue.peek();
        System.out.printf("Last is %s",lastChild);
    }
}
