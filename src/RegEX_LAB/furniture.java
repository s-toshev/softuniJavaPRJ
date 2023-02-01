package RegEX_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>\\>>)(?<name>" +
                "\\w+)(?<separator2>\\<<)(?<price>\\d+\\.?" +
                "\\d*)(?<separator3>\\!?)(?<qty>\\d+)";
        Pattern ptrn = Pattern.compile(regex);

        double price = 0;
        int qty = 0;
        double result = 0;
        List<String> furnitureList = new ArrayList<>();
        while (!input.equals("Purchase")) {
            Matcher match = ptrn.matcher(input);
            if(match.find()) {
                price = Double.parseDouble(match.group("price"));
                qty = Integer.parseInt(match.group("qty"));
                result = result + (price * qty);
                furnitureList.add(match.group("name"));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Bought furniture:%n%s%nTotal money spend" +
                ": %.2f",String.join("\n",furnitureList),result);
       // System.out.println("Bought furniture:");
        //System.out.println(String.join("\n", furnitureList));
      //  System.out.printf("Total money spend: %.2f",result);
    }
}
