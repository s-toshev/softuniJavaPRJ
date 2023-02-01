package ConditionalStatementsLab0002;

import java.util.Scanner;

public class num100num200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speed = Integer.parseInt(scanner.nextLine());

        if (speed<100){
            System.out.println("Less than 100");
        } else if (speed>=100&&speed<=200){
            System.out.println("Between 100 and 200");
        } else System.out.println("Greater than 200");
    }
}
