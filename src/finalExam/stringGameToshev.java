package finalExam;

import java.util.Scanner;

public class stringGameToshev {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        String text = scanInput.nextLine();
        String inputText = scanInput.nextLine();
        while (!inputText.equals("Done")) {
            String[] commandLine = inputText.split(" ");
            String command = commandLine[0];
            switch (command) {
                case "Change":
                    String oldChar = commandLine[1];
                    String replace = commandLine[2];
                    if (text.contains(oldChar)) {
                        text = text.replace(oldChar, replace);
                    }
                    System.out.println(text);
                    break;
                case "Includes":
                    String subString = commandLine[1];

                    if (text.contains(subString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endSubString = commandLine[1];
                    int length = endSubString.length();
                    String textEndSubstring = text.substring(text.length()-length);
                    if (textEndSubstring.equals(endSubString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase" :
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String inputSymbol = commandLine[1];
                    char symbol= inputSymbol.charAt(0);
                    int index = -1;
                    if (text.contains(inputSymbol)) {
                        index = text.indexOf(symbol);
                        System.out.println(index);
                    }
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int counter = Integer.parseInt((commandLine[2]));
                    StringBuilder sB = new StringBuilder();
                    sB.append(text);
                    sB.delete(startIndex + counter, sB.length());
                    sB.delete(0, startIndex);
                    text = sB.toString();
                    System.out.println(text);
                    break;
            }
            inputText = scanInput.nextLine();
        }
    }
}
