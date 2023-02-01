package _02ARRAYS_FUNDAMENTALS_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class test2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2 8 30 25 40 72 -2 44 56
        //как да четем данни от един ред, да се сплитнат по празно място
        //и да се конвертират от текст към числа

        String values = scanner.nextLine();
        String[] valuesArr = values.split(" ");

        int[]numbersArr=new int[valuesArr.length];
        for (int i = 0; i < valuesArr.length; i++) {
            numbersArr[i]=Integer.parseInt(valuesArr[i]);
        }

        System.out.println(Arrays.toString(numbersArr));
    }
}
