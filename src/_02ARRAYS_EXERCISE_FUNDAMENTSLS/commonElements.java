package _02ARRAYS_EXERCISE_FUNDAMENTSLS;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String elementSecond : secondArr) {
            for (String elementFirst : firstArr) {
              if(elementSecond.equals(elementFirst)){
                  System.out.print(elementSecond + " ");
                  break;
              }
            }
        }


    }
}
