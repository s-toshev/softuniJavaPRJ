package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class dayOfWeek__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strMassive = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 1 && n <= 7) {
            System.out.println(strMassive[n - 1]);
        }else {
            System.out.println("Invalid day!");
        }

    }
}
