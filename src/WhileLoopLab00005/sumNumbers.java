package WhileLoopLab00005;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum =0;
        while(sum<n){
            int newNum=Integer.parseInt(scanner.nextLine());
            sum = sum+newNum;
        }
        System.out.println(sum);
    }
}
