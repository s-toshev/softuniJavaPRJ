package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class housePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x*y;
        double window = 1.5*1.5;
        double totalSide = sideWall*2 - window*2;
        double backwall = x*x;
        double entrance = 1.2*2;
        double totalFAndB = backwall*2-entrance;
        double totalGreen = totalSide+totalFAndB;

        double greenPaint = totalGreen/3.4;

        //ROOF:

        double sideRoofs = 2*(x*y);
        double roofTriangles = 2*(x*h/2);
        double totalRed = sideRoofs+roofTriangles;

        double redPaint = totalRed/4.3;

        System.out.printf("%.2f"+"\n"+"%.2f",greenPaint,redPaint);

    }
}
