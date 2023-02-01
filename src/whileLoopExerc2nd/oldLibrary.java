package whileLoopExerc2nd;

import java.util.Scanner;

public class oldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        int checkedBooks = 0;
        String books = "";
        while (true) {
            books = scanner.nextLine();
            if (books.equals("No More Books")) {
                break;
            }
            if (books.equals(wantedBook)){
                break;
            }
            checkedBooks++;

        }
        if (books.equals(wantedBook)) {
            System.out.printf("You checked %d books" +
                    " and found it.", checkedBooks);
                    } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checkedBooks);
        }
    }
}
