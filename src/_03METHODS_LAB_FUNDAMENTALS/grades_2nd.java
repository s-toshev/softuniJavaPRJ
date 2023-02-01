package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class grades_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        gradePrint(grade);

    }
    public static void gradePrint (double g){
        if(g>=2.00&&g<=2.99){
            System.out.println("Fail");
        }else if(g>=3.00&&g<=3.49){
            System.out.println("Poor");
        }else if(g>=3.50&&g<=4.49){
            System.out.println("Good");
        }else if(g>=4.50&&g<=5.49){
            System.out.println("Very good");
        }else if(g>=5.50&&g<=6.00){
            System.out.println("Excellent");
        }
    }
}
