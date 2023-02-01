package _03METHODS_EXERC_FUNDAMENTALS;

import java.util.Scanner;

public class addSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.print(addMethod(n1,n2)-subtractMethod(n3));

    }

    public static int addMethod (int n1,int n2){
        int sum = n1+n2;
        return sum;
    }

    public static int subtractMethod (int n3){
        return n3;
    }
}
