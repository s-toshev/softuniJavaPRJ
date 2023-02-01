package firstFundMidExamSimeon;

import java.util.Scanner;

public class cookerMastreclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        int students = Integer.parseInt(scanner.nextLine());

        double packOfFlourPrice = Double.parseDouble(scanner.nextLine());

        double EggPriceSingle = Double.parseDouble(scanner.nextLine());

        double singleAprPrice = Double.parseDouble(scanner.nextLine());

        int fifthPackOfFlour = students/5;


        double total = (singleAprPrice*(Math.ceil(students*1.2)))
                +(EggPriceSingle*10*students)
                +(packOfFlourPrice*(students-fifthPackOfFlour));

        if (total<=money){

            System.out.printf("Items purchased for %.2f$.%n",total);

        }else{

            System.out.printf("%.2f$ more needed.%n",total-money);

        }
    }
}