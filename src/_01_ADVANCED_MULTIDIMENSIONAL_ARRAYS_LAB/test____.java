package _01_ADVANCED_MULTIDIMENSIONAL_ARRAYS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class test____ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = 3;
        int col = 3;
        int[][] matrix = readMatrix(row,scanner);


    }

    public static int[][]
    readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine()
                    .split("\\s+")).mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
