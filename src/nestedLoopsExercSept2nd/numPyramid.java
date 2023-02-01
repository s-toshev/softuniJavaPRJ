package nestedLoopsExercSept2nd;

import java.util.Scanner;

public class numPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <=rows ; cols++) {
                if(number>n){
                    break;
                }

                System.out.print(number + " ");
                number++;
                if(rows==cols){
                    System.out.println();
                }
            }

            }
        }


    }
