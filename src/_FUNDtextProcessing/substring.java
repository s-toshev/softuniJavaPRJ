package _FUNDtextProcessing;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        //ice
        //kicegiciceeb

        int index = text.indexOf(toRemove);

        while (index!=-1){
            text = text.replace(toRemove,"");
            index=text.indexOf(toRemove);


        }
        System.out.println(text);



    }
}
