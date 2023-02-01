package conditionalStatementsExercise;

import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int man1 = Integer.parseInt(scanner.nextLine());
        int man2 = Integer.parseInt(scanner.nextLine());
        int man3 = Integer.parseInt(scanner.nextLine());
        int totalTime = man1+man2+man3;

        int minutes = totalTime/60;
        int seconds = totalTime%60;

        if (seconds<10) {
            System.out.printf("%d:0%d", minutes,seconds);
        }else System.out.printf("%d:%d", minutes,seconds);
    }
}
