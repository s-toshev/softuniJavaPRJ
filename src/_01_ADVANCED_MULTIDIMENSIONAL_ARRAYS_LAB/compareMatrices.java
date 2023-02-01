package _01_ADVANCED_MULTIDIMENSIONAL_ARRAYS_LAB;

import java.util.Scanner;

import static _01_ADVANCED_MULTIDIMENSIONAL_ARRAYS_LAB.test____.readMatrix;

public class compareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);

        int [][] firstMatrix = readMatrix(rows,scanner);

        rows=Integer.parseInt(scanner.nextLine().split("\\s+")[0]);

        int [][] secondMatrix = readMatrix(rows,scanner);

        boolean areEqual = areEqual(firstMatrix,secondMatrix);

      //  String output = areEqual ? "equal" : "not equal";

        if(areEqual){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
       if(firstMatrix.length != secondMatrix.length){
           return false;
       }
        for (int row = 0; row < firstMatrix.length; row++) {
            int [] firstArr = firstMatrix[row];
            int [] secondArr = secondMatrix[row];

            if(firstArr.length != secondArr.length){
                return false;
            }
            for (int index = 0; index < firstArr.length; index++) {
                if(firstArr[index] != secondArr[index]){
                        return false;
                }
            }
        }
        return true;
   }
}
