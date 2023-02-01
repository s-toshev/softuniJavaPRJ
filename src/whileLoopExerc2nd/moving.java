package whileLoopExerc2nd;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int availableCubics = width * length * height;
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int numBoxes = Integer.parseInt(command);
            availableCubics = availableCubics - numBoxes;

            if(availableCubics<0){
                break;
            }



            command = scanner.nextLine();

        }

if(availableCubics<0){
    System.out.printf("No more free space! " +
            "You need %d Cubic " +
            "meters more.",Math.abs(availableCubics));
}else {
    System.out.printf("%d Cubic meters left.",availableCubics);
}
    }
}
