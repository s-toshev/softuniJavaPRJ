package WhileLoopLab00005;

import java.util.Scanner;

public class passwod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String entrancePass = scanner.nextLine();
        while(!entrancePass.equals(password)) {
           entrancePass= scanner.nextLine();

            }
        System.out.printf("Welcome %s!",name);
    }
}
