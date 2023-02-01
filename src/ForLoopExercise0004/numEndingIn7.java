package ForLoopExercise0004;

import java.util.Scanner;

public class numEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 9; i <= 999; i++) {
            if (i % 10 == 9) {
                System.out.println(i);
            }
        }
    }
}