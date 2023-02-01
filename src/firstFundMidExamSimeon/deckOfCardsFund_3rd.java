package firstFundMidExamSimeon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class deckOfCardsFund_3rd {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        List <String> allCards = textToArray(newScanner);

        int num = Integer.parseInt(newScanner.nextLine());

        for (int x = 0; x < num; x++) {
            String[] inArray = newScanner.nextLine().split(",\\s+");
            String cmdInput = inArray[0];
            switch (cmdInput) {

                case "Add":
                    if (!allCards.contains(inArray[1])){
                        allCards.add(inArray[1]);
                        System.out.println("Card successfully added");
                        break;
                    } else {
                        System.out.println("Card is already in the deck");
                    }
                    break;

                case "Remove":
                    if (allCards.contains(inArray[1])) {
                        allCards.remove(inArray[1]);
                        System.out.println("Card successfully removed");
                        break;
                    } else {
                        System.out.println("Card not found");
                    }
                    break;

                case "Remove At":
                    int y = Integer.parseInt(inArray[1]);
                    if (y >= 0 && y < allCards.size()) {
                        allCards.remove(y);
                        System.out.println("Card successfully removed");
                        break;

                    } else {

                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    y = Integer.parseInt(inArray[1]);
                    String cardName = inArray[2];

                    if (y >= 0 && y < allCards.size()) {

                        if (allCards.contains(cardName)) {

                            System.out.println("Card is already added");
                            break;
                        } else {

                            allCards.add(y,cardName);

                            System.out.println("Card successfully added");
                        }
                        break;
                        ///////
                    } else {

//////
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }


        listOfStringsPrinter(allCards);
    }

    public static List<String> textToArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());
    }

    public static void listOfStringsPrinter(List<String> stringList) {
        for (int index = 0; index < stringList.size(); index++) {

            System.out.print(stringList.get(index));

            if (index < stringList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}