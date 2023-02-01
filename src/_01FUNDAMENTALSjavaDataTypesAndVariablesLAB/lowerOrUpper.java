package _01FUNDAMENTALSjavaDataTypesAndVariablesLAB;

import java.util.Scanner;

public class lowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);

        if(Character.isUpperCase(one)){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }

    }
}
