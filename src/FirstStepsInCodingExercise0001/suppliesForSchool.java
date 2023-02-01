package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencilPack = Integer.parseInt(scanner.nextLine());
        int markerPack = Integer.parseInt(scanner.nextLine());
        int litersDetergent = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pencilPrice = pencilPack*5.80;
        double markerPrice = markerPack*7.20;
        double detergPrice = litersDetergent*1.20;

        double totalPrice = (pencilPrice+markerPrice+detergPrice)-
                ((pencilPrice+markerPrice+detergPrice)*percentDiscount/100);

        System.out.println(totalPrice);



    }
}
