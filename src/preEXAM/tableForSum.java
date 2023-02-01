package preEXAM;

import java.util.Scanner;

public class tableForSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            double hundreds = n%10;
            double lefts=(n-hundreds)/10;
            double decimals=lefts%10;
            double ones = (lefts-decimals)/10;

        for (int i = 1; i <=hundreds ; i++) {
            for (int j = 1; j <=decimals ; j++) {
                for (int k = 1; k <=ones ; k++) {
                    int result = i*j*k;
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,result);
                }
            }
        }
        
    }
}
  