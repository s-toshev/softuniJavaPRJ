package whileLoopSeptRetestLab;

import java.util.Scanner;

public class wordRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
           String inputText=scanner.nextLine();

            if(inputText.equals("Stop")){
                break;
            }
            System.out.println(inputText);
        }

    }
}
