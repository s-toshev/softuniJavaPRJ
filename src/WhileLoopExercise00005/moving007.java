package WhileLoopExercise00005;

import java.util.Scanner;

public class moving007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int heigth = Integer.parseInt(scanner.nextLine());

        int freeSpace = width*length*heigth;

        String command = scanner.nextLine();
        boolean noSpace = false;
        int usedSpace = 0;
        while(!command.equals("Done")){
            int cubics = Integer.parseInt(command);

            usedSpace=usedSpace+cubics;
            if (freeSpace<usedSpace){
                noSpace=true;
                break;
            }

            command= scanner.nextLine();
        }

        if (noSpace){
            System.out.printf("No more free space! " +
                    "You need %d Cubic meters " +
                    "more.",Math.abs(freeSpace-usedSpace));
        }else {
            System.out.printf("%d Cubic meters" +
                    " left.",Math.abs(freeSpace-usedSpace));
        }
    }
}
