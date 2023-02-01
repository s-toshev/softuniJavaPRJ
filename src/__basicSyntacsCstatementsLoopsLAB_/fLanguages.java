package __basicSyntacsCstatementsLoopsLAB_;

import java.util.Scanner;

public class fLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cName = scanner.nextLine();

        switch (cName){
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
