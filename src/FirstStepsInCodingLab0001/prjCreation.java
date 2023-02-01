package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class prjCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int prjNum = Integer.parseInt(scanner.nextLine());

        int timePrj = prjNum*3;

        System.out.printf("The architect %s will need " +
                "%d hours to complete " +
                "%d project/s.",name,timePrj,prjNum);
    }
}
