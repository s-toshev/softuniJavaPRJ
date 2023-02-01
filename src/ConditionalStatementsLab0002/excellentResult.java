package ConditionalStatementsLab0002;

import java.util.Scanner;

public class excellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number>=5){
            System.out.println("Excellent!");
        }
    }
}
