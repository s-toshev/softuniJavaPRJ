package nestedLoopsExercSept2nd;

import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int gradeCount = 0;
        double allGradeSum = 0;
        while (!command.equals("Finish")) {
            String presentation = command;

            double sumGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble
                        (scanner.nextLine());
                sumGrades = sumGrades + grade;
                gradeCount++;
            }
            allGradeSum = allGradeSum + sumGrades;
            double avgGrade = sumGrades / n;

            System.out.printf("%s - %.2f.%n" +
                    "", presentation, avgGrade);

            command = scanner.nextLine();
        }

        double finalGrade = allGradeSum / gradeCount;
        System.out.printf("Student's final" +
                " assessment is %.2f.", finalGrade);
    }
}
