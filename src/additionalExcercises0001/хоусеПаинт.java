package additionalExcercises0001;

import java.util.Scanner;

public class хоусеПаинт {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x*y;
        double window = 1.5*1.5;
        double twoSides = 2*sideWall-(2*window);
        double backWall = x*x;
        double entrance = 1.2*2;
        double frontRear = 2*backWall-entrance;
        double totalHouse = twoSides+frontRear;

        double greenPaint = totalHouse/3.4;

        double twoRect = 2*(x*y);
        double triangles = 2*(x*h/2);
        double totalRoof = twoRect+triangles;

        double redPaint = totalRoof/4.3;



        System.out.printf("%.2f %n %.2f",greenPaint,redPaint);

    }
}
