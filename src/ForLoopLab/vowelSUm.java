package ForLoopLab;

import java.util.Scanner;

public class vowelSUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a') {
                sum = sum + 1;
            } else if (word.charAt(i) == 'e') {
                sum = sum + 2;
            } else if (word.charAt(i) == 'i') {
                sum = sum + 3;
            } else if (word.charAt(i) == 'o') {
                sum = sum + 4;
            } else if (word.charAt(i) == 'u') {
                sum = sum + 5;
            }
        }
        System.out.println(sum);
    }
}
