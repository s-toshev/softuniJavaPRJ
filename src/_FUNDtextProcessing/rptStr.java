package _FUNDtextProcessing;

import java.util.Scanner;

public class rptStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");

        String result = "";
        for (String word : strArr) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                result = result + word;
            }
        }

        System.out.println(result);

    }
}
