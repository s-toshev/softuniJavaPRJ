package WhileLoopExercise00005;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePieces = width * length;
        String command = scanner.nextLine();
        boolean isEaten = false;
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);

            cakePieces = cakePieces - pieces;

            if (cakePieces < 0) {
                isEaten = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (isEaten) {
            System.out.printf("No more cake left! You need" +
                    " %d pieces more.",Math.abs(cakePieces));
        } else {

            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}