package whileLoopSeptRetestLab;

import java.util.Scanner;

public class graduation_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int lowGradeCount = 0;
        int clas = 1;
        double sum = 0;
        while (clas <= 12) {
            if (lowGradeCount == 2) {
                break;
            }
            double yearDegree = Double.parseDouble(scanner.nextLine());
            if (yearDegree < 4) {
                lowGradeCount++;
                continue;
            }


            sum = sum + yearDegree;

            clas++;
        }
        if (lowGradeCount == 2) {
            System.out.printf("%s has " +
                    "been excluded at %d grade", name, clas);
        } else {
            double avgGrade = sum / (clas - 1);
            System.out.printf("%s graduated. Average" +
                    " grade: %.2f", name, avgGrade);
        }
    }
}