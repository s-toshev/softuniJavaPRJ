package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Scanner;

public class test3__ {
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


        System.out.println(String.join(" ",dayOfWeekArray));

    }
}
