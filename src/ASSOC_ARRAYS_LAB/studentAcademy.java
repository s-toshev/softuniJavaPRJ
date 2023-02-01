package ASSOC_ARRAYS_LAB;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int student = 0; student <= countStudents; student++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);
        }

        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            String studentsName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double avgGrade = getAverageGrade(listGrades);
            if (avgGrade >= 4.50) {
                averageGradeStudents.put(studentsName, avgGrade);
            }
        }

        averageGradeStudents.entrySet().forEach(entry ->
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades = sumGrades + grade;
        }
        return sumGrades / listGrades.size();
    }
}
