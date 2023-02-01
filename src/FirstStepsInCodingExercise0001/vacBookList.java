package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class vacBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPage = Integer.parseInt(scanner.nextLine());
        int pagePerHour = Integer.parseInt(scanner.nextLine());
        int daysBook = Integer.parseInt(scanner.nextLine());

        int totalTime = bookPage/pagePerHour;
        int timeNeededPerDay = totalTime/daysBook;

        System.out.println(timeNeededPerDay);

    }
}
