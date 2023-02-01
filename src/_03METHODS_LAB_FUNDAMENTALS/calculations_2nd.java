package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class calculations_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        actionPrint(action,n1,n2);
    }
    public static void actionPrint (String a1,int n3,int n4){
        switch (a1){
            case "divide":
                System.out.println(n3/n4);
                break;
            case "subtract":
                System.out.println(n3-n4);
                break;
            case "multiply":
                System.out.println(n3*n4);
                break;
            case "add":
                System.out.println(n3+n4);
                break;
        }
    }

}
