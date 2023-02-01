package FUNDAMENTALSJava2022Excercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password +=currentSymbol;
        }
    }
}
