package conditionalStatementsAdvancedExercise;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int columns = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        double totalRevenue = 0.0;

        if (type.equals("Premiere")) {
            totalRevenue=columns*rows*12.00;
        } else if (type.equals("Normal")) {
            totalRevenue=columns*rows*7.50;
        }else if (type.equals("Discount")) {
            totalRevenue = columns * rows * 5.00;
        }
        System.out.printf("%.2f leva", totalRevenue);



    }
}
