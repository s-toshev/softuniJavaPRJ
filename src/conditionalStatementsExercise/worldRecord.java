package conditionalStatementsExercise;

import java.util.Scanner;

public class worldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timeSec1m = Double.parseDouble(scanner.nextLine());

        double timeForGivenMeters = meters * timeSec1m;
        double penalty =Math.floor(meters / 15) * 12.5;
        double totalTime = timeForGivenMeters + penalty;
        double down = Math.floor(45.67);

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new " +
                    "world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was " +
                    "%.2f seconds slower.", Math.abs(record - totalTime));
        }
    }
}