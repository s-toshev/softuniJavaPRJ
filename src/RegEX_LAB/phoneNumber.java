package RegEX_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(\\+359)([ -])([2])\\2(\\d{3})\\2(\\d{4})\\b";
        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(text);

        List<String> numbersList = new ArrayList<>();
        while(match.find()){
            numbersList.add(match.group());
        }
        System.out.println(String.join(", ", numbersList));

    }
}
