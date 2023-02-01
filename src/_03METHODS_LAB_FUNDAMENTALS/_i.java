package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command){
            case "int":
                System.out.println(getMax(Integer.parseInt(scanner.nextLine()),
                        Integer.parseInt(scanner.nextLine())));
                break;
            case "char":
                System.out.println(getMax(scanner.nextLine().charAt(0),
                        scanner.nextLine().charAt(0)));
                break;
            case "string":
                System.out.println(getMax(scanner.nextLine(),scanner.nextLine()));
                break;
        }


    }

    public static int getMax(int n1, int n2){

        if(n1>n2){
            return n1;
        }else {
            return n2;
        }

    }

    public static char getMax(char a, char b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }

    public static String getMax(String one,String two){
        if(one.compareTo(two)>0){
            return one;
        }else {
            return two;
        }
    }

}
