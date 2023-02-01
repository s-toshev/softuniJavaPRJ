package RegEX_LAB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPhoneNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String telephoneNumbers = scanner.nextLine();
        String regex = "(\\+359)([- ])(2{1})\\2(\\d{3})\\2(\\d{4})\\b";

        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(telephoneNumbers);

        List<String> numList = new LinkedList<>();
        while (match.find()){
            numList.add(match.group());
        }
        System.out.println(String.join(", ",numList));
    }
}