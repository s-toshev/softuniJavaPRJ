package _01_ADVANCED_STACKS_N_QUEUES_LAB;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbersArr = scanner.
                nextLine().split(" ");
        ArrayDeque<String> tokens = new ArrayDeque<>();

        for (String s : numbersArr){
            tokens.push(s);
        }


        while (tokens.size()>1){
            int firstNum = Integer.
                    parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNum = Integer.
                    parseInt(tokens.pop());
            int result = 0;
            if(operator.equals("+")){
              result = firstNum+secondNum;
            }else{
                result=firstNum-secondNum;
            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.peek());
    }
}
