package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class repeatString_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        inputN(input,n);

    }

    public static String inputN (String input, int n){
        String result = "";
        for (int i = 0; i <n ; i++) {
            System.out.print(input);
        }
        return result;
    }

}
