package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class dayOfWeek____ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String[] arrDays = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if(day>=1 && day<=7){
            System.out.println(arrDays[day-1]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
