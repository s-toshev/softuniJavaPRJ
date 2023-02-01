package _FUNDtextProcessing;

import java.util.Scanner;

public class test__ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Simionaki";
        String name1 = name + " 25";

        System.out.println(name.concat(name1));

        System.out.println(String.join(", ", name, name1));

//substring взима и връща определена част от първоначалният стринг
        String card = "10vga";
        String power = card.substring(2, 5);

        System.out.println(power);

        String exactWord = card.substring(2);

        System.out.println(exactWord);

        String fruits = "apple, kiwi, banana, apple";

        System.out.println(fruits.indexOf("kiwi"));
        System.out.println(fruits.lastIndexOf("apple"));
        System.out.println(fruits.contains("apple"));

        StringBuilder sb = new StringBuilder();
        sb.append("cow ");
        sb.append("gives ");
        sb.append("milk!");
        System.out.println(sb.toString());
    }
}
