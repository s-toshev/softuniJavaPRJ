package _02ARRAYS_FUNDAMENTALS_LAB;

import java.lang.reflect.Array;
import java.util.Scanner;

public class dayOfWeek_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};

        int n = Integer.parseInt(scanner.nextLine());

        if(n>=1 && n<=7){
            System.out.println(days[n-1]);
        }else{
            System.out.println("Invalid day!");
        }

    }
}
