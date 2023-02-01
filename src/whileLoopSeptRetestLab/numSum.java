package whileLoopSeptRetestLab;

import java.util.Scanner;

public class numSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());

        int num2Sum = 0;
        while (true){
            int number2 = Integer.parseInt(scanner.nextLine());
            num2Sum=num2Sum+number2;
            if (num2Sum>=number1){
                System.out.println(num2Sum);
                break;
            }
        }

    }
}
