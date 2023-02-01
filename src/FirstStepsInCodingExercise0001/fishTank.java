package FirstStepsInCodingExercise0001;

import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int aquariumVolume = length*height*depth;
        double volumeLiters = aquariumVolume*0.001;
        double neededLiters = volumeLiters*(1-(percentage/100));

        System.out.println(neededLiters);

    }
}
