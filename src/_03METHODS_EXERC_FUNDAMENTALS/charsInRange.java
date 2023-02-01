package _03METHODS_EXERC_FUNDAMENTALS;

import java.util.Scanner;

public class charsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char s1 = scanner.nextLine().charAt(0);
        char s2 = scanner.nextLine().charAt(0);

        printCharactersInRange(s1,s2);

    }

    public static
    void printCharactersInRange (char s1, char s2){
        if(s1<s2){
            for (char symbol = (char)(s1+1); symbol < s2; symbol++) {
                System.out.print(symbol + " ");
            }
        }else {
            for (char symbol = (char)(s2+1); symbol <s1 ; symbol++) {
                System.out.print(symbol+ " ");
            }
        }


    }

}
