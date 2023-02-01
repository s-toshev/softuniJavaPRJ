package RegEX_LAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[A-Za-z]+";
        Pattern pattern = Pattern.compile(regex);

        String text = "Hello Java";
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.println(matcher.group());
        }


        //System.out.println(matcher.find());

        //String res = matcher.replaceAll("hi");

        //String res2 = matcher.replaceFirst("hi");
        //(?<day>\d{2})\-(?<month>\w{3})\-(?<year>\d{4})

    }
}
