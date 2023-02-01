package ConditionalStatementsLab0002;

import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double area = 0;

        if (figure.equals("square")){
            double x = Double.parseDouble(scanner.nextLine());
            area = x*x;
            System.out.printf("%.3f",area);
        } else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a*b;
            System.out.printf("%.3f",area);
        }else if (figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = r*r*Math.PI;
            System.out.printf("%.3f",area);
        }else if (figure.equals("triangle")){
            double c = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = (c*h)/2;
            System.out.printf("%.3f",area);
        }
    }
}
