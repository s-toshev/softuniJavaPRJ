package _04_FUND_JAVA_OBJ_CLASS_LAB;

import java.math.BigInteger;
import java.util.Scanner;

public class sumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

        BigInteger result = firstNum.add(secondNum);

        System.out.println(result);
    }
}
