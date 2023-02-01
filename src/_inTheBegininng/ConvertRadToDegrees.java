package _inTheBegininng;

import java.util.Scanner;

public class ConvertRadToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Rad = Double.parseDouble(scanner.next());
        double Deg = Rad * 180/Math.PI;

        System.out.println(Deg);
    }
}
