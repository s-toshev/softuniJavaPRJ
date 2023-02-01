package whileLoopExerc2nd;

import java.util.Scanner;

public class examPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        String quest = "";
        int badGrade = 0;
        double totalGrade = 0;
        int gradeCount = 0;
        String lastProblem = "";
        while (true){
            quest = scanner.nextLine();
            if(quest.equals("Enough")){
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            totalGrade=totalGrade+grade;
            if (grade<=4){
                badGrade++;
            }
            if (badGrade==maxBadGrades){
                break;
            }
            gradeCount++;
            lastProblem=quest;
        }
        if(quest.equals("Enough")){
            System.out.printf("Average score: %.2f%n",totalGrade/gradeCount);
            System.out.printf("Number of problems: %d%n",gradeCount);
            System.out.printf("Last problem: %s",lastProblem);
        }else {
            System.out.printf("You need a break, %d poor grades.",badGrade);
        }
    }
}
