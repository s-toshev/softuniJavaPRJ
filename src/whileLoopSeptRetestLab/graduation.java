package whileLoopSeptRetestLab;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double avgGrade = 0;
        int clas = 1;
        int lowGrade = 0;
        while (true) {
            double grade = Double.parseDouble(scanner.nextLine());

            avgGrade = avgGrade + grade;
            if (grade < 4) {
                lowGrade++;
                continue;
            }
            if (lowGrade == 2) {
                System.out.printf("%s has been excluded at " +
                        "%d grade", name, clas);
                break;
            }
            if (clas == 12) {
                System.out.printf("%s graduated. " +
                        "Average grade: %.2f", name, avgGrade / clas);
            }
            clas++;
        }
    }
}