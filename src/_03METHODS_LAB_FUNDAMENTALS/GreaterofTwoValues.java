package _03METHODS_LAB_FUNDAMENTALS;

import java.util.Scanner;

public class GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int n1 = Integer.parseInt(scanner.nextLine());
                int n2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(n1, n2));
                break;
            case "char":
                char s1 = scanner.nextLine().charAt(0);
                char s2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(s1, s2));
                break;
            case "string":
                String t1 = scanner.nextLine();
                String t2 = scanner.nextLine();
                System.out.println(getMax(t1, t2));

                break;
        }
    }

    public static int getMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static char getMax(char s1, char s2) {
        if (s1 > s2) {
            return s1;
        } else {
            return s2;
        }
    }

    public static String getMax(String t1, String t2) {
//        if (t1.length() > t2.length()) {
        //           return t1;
//        } else {
        //           return t2;

        if (t1.compareTo(t2) > 0) {
            return t1;
        } else {
            return t2;
        }
    }

}
