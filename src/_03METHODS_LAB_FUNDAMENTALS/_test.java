package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        printReceipt(scanner.nextLine());



    }

    public static void printReceipt(String text){
        printHeader();
        printBody(text);
        printFooter();
    }

    public static void printHeader(){
        System.out.println("**************");
    }
    public static void printBody (String text){
        System.out.println(text);
    }

    public static void printFooter(){
        System.out.println("**************");
    }
}
