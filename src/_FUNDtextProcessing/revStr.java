package _FUNDtextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class revStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        while (!words.equals("end")) {

            String reversed = "";
            for (int i = words.length() - 1; i >= 0; i--) {
                char crrentSym = words.charAt(i);
                reversed = reversed+crrentSym;
            }

            System.out.printf("%s = %s%n",words,reversed);

            words = scanner.nextLine();
        }

    }
}
