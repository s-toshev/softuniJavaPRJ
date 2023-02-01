package RegEX_LAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchFullName_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b";

        Pattern test = Pattern.compile(regex);
        Matcher match = test.matcher(text);

        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}
