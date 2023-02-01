package _04_FUND_JAVA_OBJ_CLASS_LAB;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        int rndNum = rnd.nextInt(100);

        System.out.println(rndNum);
    }
}
