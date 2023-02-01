package whileLoopSeptRetestLab;

import java.util.Scanner;

public class labTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String neshto = scanner.nextLine();

        while (!neshto.equals("Stop")){
            System.out.println("InfiniteLoop");
            neshto= scanner.nextLine();
        }

    }
}
