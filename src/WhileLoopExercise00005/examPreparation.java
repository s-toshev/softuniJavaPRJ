package WhileLoopExercise00005;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        int counterBadGrades = 0;
        double totalScore = 0;
        int counterProblems=0;
        String lastProblem = "";
        while (true){
            String taskName = scanner.nextLine();
            int grade = Integer.parseInt(scanner.nextLine());
            counterProblems++;
            if (grade<=4){
                counterBadGrades++;
            }
            totalScore=totalScore+grade;
            double avgScore=totalScore/counterProblems;
            lastProblem.equals(taskName);
            if(taskName.equals("Enough")){
                System.out.printf("Average score: %.2f%n"+
                        "Number of problems: %d%n"+
                        "Last problem: %s%n",avgScore,counterProblems,lastProblem);
                break;
            }
        }

    }
}
