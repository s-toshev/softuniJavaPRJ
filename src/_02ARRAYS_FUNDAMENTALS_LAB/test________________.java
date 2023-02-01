package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class test________________ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] newArray = new int[5];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i]= 1+i;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
