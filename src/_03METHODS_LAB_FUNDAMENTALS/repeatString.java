package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String resultText = repeatStr(n,inputText);
        System.out.println(repeatStr(n,inputText));

    }
    public static String repeatStr(int n, String text){
       String result = "";
        for (int i = 0; i < n; i++) {
result=result + text;
        }
        return result;
    }
}
