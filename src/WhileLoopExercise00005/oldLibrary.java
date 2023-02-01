package WhileLoopExercise00005;

import java.util.Scanner;

public class oldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        int counter = 0;
        while(true){
            String searchedBooks= scanner.nextLine();
            counter++;

            if (searchedBooks.equals(book)
                    ||searchedBooks.equals("No More Books")){
                counter--;
            }

            if (searchedBooks.equals(book)){
                System.out.printf("You checked %d books" +
                        " and found it.",counter);
                break;
            }
            if (searchedBooks.equals("No More Books")){
                System.out.printf("The book you search is not here!%n" +
                        "You checked %d books.",counter);
            }
        }
    }
}
