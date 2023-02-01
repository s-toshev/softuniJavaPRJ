package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class test__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2 8 30 25 40 72 -2 44 56

//        String values = scanner.nextLine();
  //      String[] arrValues = values.split(" ");
//
  //      int[] numArr = new int[arrValues.length];
    //    for (int i = 0; i < arrValues.length; i++) {
      //      numArr[i]=Integer.parseInt(arrValues[i]);

        //}

        String lineInput = scanner.nextLine();


        int[] numbersArr = Arrays.
                stream(lineInput.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("%d -> %d%n",i,numbersArr[i]);
        }


    }
}
