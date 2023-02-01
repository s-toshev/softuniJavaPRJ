package _inTheBegininng;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int DaysPerBook = Integer.parseInt(scanner.nextLine());
        int TotalTimePerBook = numberOfPages/PagesPerHour;
        int NumberOfHoursPerDay = TotalTimePerBook/DaysPerBook;
        System.out.println(NumberOfHoursPerDay);
    }
}
