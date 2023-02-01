package RegEX_LAB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dates = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})(?<separator>" +
                "[\\/\\.\\-])(?<Month>[A-Z][a-z][a-z])\\2(?<year>\\d{4})\\b";

        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(dates);

        while (match.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    match.group("day"),match.group("Month"),
                    match.group("year"));
        }
    }
}
