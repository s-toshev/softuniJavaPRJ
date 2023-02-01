package nestedLoopsLab00006;

import java.util.Scanner;

public class multipTable {
    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {
            for (int y = 1; y <=10 ; y++) {
                System.out.printf("%d * %d = %d%n",x,y,x*y);
            }
        }
    }
}
