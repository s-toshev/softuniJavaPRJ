package _03METHODS_EXERC_FUNDAMENTALS;

import java.util.Scanner;

public class vowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowelsCoun(input.toLowerCase());


    }
    public static void printVowelsCoun (String text){
        int counter = 0;
        for (char symbol: text.toCharArray()) {
            if(symbol== 'a' || symbol== 'e'|| symbol== 'i'
                    || symbol== 'o'|| symbol== 'u' ){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
