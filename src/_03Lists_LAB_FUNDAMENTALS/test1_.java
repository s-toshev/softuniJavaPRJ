package _03Lists_LAB_FUNDAMENTALS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //direktno dobavqme elementi pri suzdavaneto na list
        List<String> listStr = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four"
        ));

        System.out.println(String.join(" ",listStr));
    }
}
