package _inTheBegininng;

import java.util.Scanner;

public class aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double aquariumVolumeCm3 = length*width*height;
        double volumeInLiters = aquariumVolumeCm3*0.001;
        double usedSpace = percentage/100;
        double litersNeeded = volumeInLiters*(1-usedSpace);

        System.out.println(litersNeeded);
    }
}
