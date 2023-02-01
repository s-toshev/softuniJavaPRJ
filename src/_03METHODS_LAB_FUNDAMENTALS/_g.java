package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class _g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        repeatString(scanner.nextLine(),Integer.parseInt(scanner.nextLine()));

    }

    public static String repeatString (String letters,int n){

        String result =letters;
        for (int i = 1; i <=n ; i++) {

            System.out.print(result);
        }


return result;
    }

}
