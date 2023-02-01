package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class messageTranslatorToshev {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        int line = Integer.parseInt(scInput.nextLine());
        String rgx = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<string>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(rgx);
        for (int i = 0; i < line; i++) {
            String input = scInput.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                List<Integer> print = new ArrayList<>();
                String command = matcher.group("command");
                String string = matcher.group("string");
                for (char ch : string.toCharArray()) {
                    int intChar = (int) ch;
                    print.add(intChar);
                }
                System.out.print(command + ":" + " ");
                for (int element : print) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("The message is invalid");
            }
        }
    }
}