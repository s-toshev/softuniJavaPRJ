package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class mathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(mathOperations(Integer.parseInt(scanner.nextLine()),
                scanner.nextLine(),Integer.parseInt(scanner.nextLine())));

    }

    public static int mathOperations (int n1, String operation, int n2){

        int result = 0;
        switch (operation){
            case "*":
                result= n1*n2;
                break;
            case "/":
                result= n1/n2;
                break;
            case "+":
                result= n1+n2;
                break;
            case "-":
                result= n1-n2;
                break;
        }
        return result;
    }

}
