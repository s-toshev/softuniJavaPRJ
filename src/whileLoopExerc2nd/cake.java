package whileLoopExerc2nd;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int totalCakePieces = width * length;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int piecesTaken = Integer.parseInt(command);
            totalCakePieces = totalCakePieces - piecesTaken;

            if(totalCakePieces<0){
                break;
            }
            command = scanner.nextLine();
        }
        if(totalCakePieces<0){
            System.out.printf("No more cake left! You need " +
                    "%d pieces more.",Math.abs(totalCakePieces));
        }else{
            System.out.printf("%d pieces are left.", totalCakePieces);

        }
    }
}

