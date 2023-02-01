package whileLoopSeptRetestLab;

import java.util.Scanner;

public class labTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5;

        while (true){
            if(a>10){
                break;
            }
            System.out.println("a = " + a);
            a++;
        }

    }
}
