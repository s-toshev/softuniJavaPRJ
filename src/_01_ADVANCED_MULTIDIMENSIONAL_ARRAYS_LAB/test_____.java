package _01_ADVANCED_MULTIDIMENSIONAL_ARRAYS_LAB;

import java.util.Scanner;

public class test_____ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int[3][3];

        matrix[0][0] = 5;
        matrix[0][1] = 6;
        matrix[0][2] = 7;
        matrix[1][0] = 1;
        matrix[1][1] = 2;
        matrix[1][2] = 3;
        matrix[2][0] = 8;
        matrix[2][1] = 9;
        matrix[2][2] = 0;

        printSquareMatrix(matrix);
        printMatrixDiffRowCol(matrix,3,3);

    }
    public static void printSquareMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void printMatrixDiffRowCol (int [][] matrix,
                                              int rows, int cols){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
