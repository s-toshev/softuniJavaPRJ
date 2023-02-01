package FUNDAMENTALSjavaLab222;

import java.util.Scanner;

public class passedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if(num>=3.00){
            System.out.println("Passed!");
        }else System.out.println("Failed!");

    }
}
