package WhileLoopLab00005;

import java.util.Scanner;

public class passW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String userPass = scanner.nextLine();

        String input = scanner.nextLine();
        while(!input.equals(userPass)){
            input = scanner.nextLine();
        }

        System.out.printf("Welcome: %s!",userName);
    }
}
