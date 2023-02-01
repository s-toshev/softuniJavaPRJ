package nestedLoopsLAB2ndSept;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFound = false;
        for (int a = start; a <= end; a++) {
            for (int b = start; b <= end; b++) {
                int currentSum = a + b;
                counter++;
                if (currentSum == magicNum) {
                    System.out.printf("Combination N:%d " +
                            "(%d + %d = %d)%n",counter, a, b, a + b);
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }

        }
if(!isFound){
    System.out.printf("%d combinations - " +
            "neither equals %d%n",counter,magicNum);
}
    }
}
