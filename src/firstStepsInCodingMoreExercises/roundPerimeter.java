package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class roundPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  r = Double.parseDouble(scanner.nextLine());

        double area = r*r*Math.PI;
                double perimeter = 2*Math.PI*r;

        System.out.printf("%.2f"+"\n"+"%.2f",area,perimeter);
    }
}
