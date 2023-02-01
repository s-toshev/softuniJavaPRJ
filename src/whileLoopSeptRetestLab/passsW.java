package whileLoopSeptRetestLab;

import java.util.Scanner;

public class passsW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        while(true){
String enteredPassword = scanner.nextLine();

            if(enteredPassword.equals(password)){
                System.out.printf("Welcome %s!",name);
                break;
            }

        }

    }
}
