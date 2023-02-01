package FirstStepsInCodingLab0001;

import java.util.Scanner;

public class prj2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String archN = scanner.nextLine();
        int prjNum = Integer.parseInt(scanner.nextLine());
        int totalPrjTime = prjNum*3;

        System.out.printf("The architect %s will need " +
                "%d hours to complete %s project/s.",archN,totalPrjTime,prjNum
        );

    }
}
