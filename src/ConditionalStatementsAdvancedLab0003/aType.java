package ConditionalStatementsAdvancedLab0003;

import java.util.Scanner;

public class aType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch(animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
            default:
                System.out.println("unknown");
break;
        }

    }
}
