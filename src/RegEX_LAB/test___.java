package RegEX_LAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test___ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[A-Za-z]+";
        Pattern pattern = Pattern.compile(regex);

        String string = "Hello Java";
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
