package WhileLoopLab00005;

import java.util.Scanner;

public class biggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE;
        while(true){
            int currentNum=Integer.parseInt(input);
             input= scanner.nextLine();

             if (currentNum>maxNum){
                 maxNum=currentNum;
             }
             if(input.equals("Stop")){
                 break;
             }
        }
        System.out.println(maxNum);
    }
}

