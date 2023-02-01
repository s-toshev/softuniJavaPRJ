package forLoopExerc;

import java.util.Scanner;

public class salary5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int globa = 0;
        for (int i = 1; i <=nTabs; i++) {
            String websiteName = scanner.nextLine();

            if(websiteName.equals("Facebook")){
                salary=salary-150;
            }else if (websiteName.equals("Instagram")){
                salary=salary-100;
            }else if (websiteName.equals("Reddit")){
                salary=salary-50;
            }


            if (salary<=0){
                break;
            }
        }
        if (salary>0){
            System.out.println(salary);
        }else System.out.println("You have lost your salary.");
    }
}
