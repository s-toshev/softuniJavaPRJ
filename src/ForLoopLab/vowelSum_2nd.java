package ForLoopLab;

import java.util.Scanner;

public class vowelSum_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a'){
                sum = sum+1;
            }else if(text.charAt(i) == 'e'){
                sum = sum + 2;
            }else if(text.charAt(i) == 'i'){
                sum = sum + 3;
            }else if(text.charAt(i) == 'o'){
                sum = sum + 4;
            }else if(text.charAt(i) == 'u'){
                sum = sum + 5;
            }
        }
        System.out.println(sum);
    }
}
