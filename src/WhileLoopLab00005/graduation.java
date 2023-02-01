package WhileLoopLab00005;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double totalGrades = 0;
        double n = 1;
        int poorGrade = 0;
        while (n <= 12) {
            if (poorGrade == 2) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4) {
                poorGrade++;
                continue;
            }

            totalGrades = totalGrades + currentGrade;
            n++;
        }
        if (poorGrade == 2) {
            System.out.printf("%s has been excluded at %.0f grade", name, n);
        } else {
            System.out.printf("%s graduated. Average " +
                    "grade: %.2f", name, totalGrades / (n - 1));
        }
    }
}