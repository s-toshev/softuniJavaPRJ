package ForLoopLab;

import java.util.Scanner;

public class vowelSumSecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String duma = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < duma.length(); i++) {
            switch (duma.charAt(i)){
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
