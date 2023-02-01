package _inTheBegininng;

import java.util.Scanner;

public class PRJc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Arch = scanner.nextLine();
        int prjNumber = Integer.parseInt(scanner.nextLine());
        int hourstocomplete = prjNumber*3;
        System.out.println("The architect " + Arch +
                " will need " + hourstocomplete + " hours to complete " +
                prjNumber + " project/s.");
    }
}
