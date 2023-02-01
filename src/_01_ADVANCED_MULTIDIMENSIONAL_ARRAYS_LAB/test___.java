package _01_ADVANCED_MULTIDIMENSIONAL_ARRAYS_LAB;

import java.util.Scanner;

public class test___ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[13];

        int[][] intMatrix = new int[3][];
        int[][] matrix = {
                {13, 42, 23, 24},
                {13, 42, 23, 83},

        };


        int[] secondRow = matrix[1];
        secondRow[3] = 150;
        int lastElement = secondRow[3];

        int element = matrix[1][3];
        System.out.println(element);

        System.out.println(lastElement);


    }
}
