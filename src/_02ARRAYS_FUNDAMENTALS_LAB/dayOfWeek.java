package arraysLabFUND;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeekArray = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int n = Integer.parseInt(scanner.nextLine());

        if(n >=1 && n<=7){
            System.out.println(dayOfWeekArray[n-1]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
