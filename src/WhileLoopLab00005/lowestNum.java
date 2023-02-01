package WhileLoopLab00005;

import java.util.Scanner;

public class lowestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        int minValue = Integer.MAX_VALUE;
        while(true){
            int currentNum=Integer.parseInt(input);
            input= scanner.nextLine();

            if(currentNum<minValue){
                minValue=currentNum;
            }

            if(input.equals("Stop")){
                break;
            }
        }
        System.out.println(minValue);
    }
}
