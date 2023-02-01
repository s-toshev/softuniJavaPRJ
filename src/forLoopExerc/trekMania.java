package forLoopExerc;

import java.util.Scanner;

public class trekMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;
        for (int i = 1; i <=numberOfGroups; i++) {
            int peopleInGrp = Integer.parseInt(scanner.nextLine());
            totalPeople=totalPeople+peopleInGrp;
            if(peopleInGrp<=5){
                musala = musala+peopleInGrp;
            }else if (peopleInGrp>=6&&peopleInGrp<=12){
                monblan=monblan+peopleInGrp;
            }else if (peopleInGrp>=13&&peopleInGrp<=25){
                kilimanjaro=kilimanjaro+peopleInGrp;
            }else if(peopleInGrp>=26&&peopleInGrp<=40){
                k2=k2+peopleInGrp;
            }else if (peopleInGrp>=41){
                everest=everest+peopleInGrp;
            }

        }
        double musalaClimber = musala*1.0/totalPeople*100;
        double monblanClimber = monblan*1.0/totalPeople*100;
        double kilimanjClimber = kilimanjaro*1.0/totalPeople*100;
        double k2Climber = k2*1.0/totalPeople*100;
        double evrestClimber = everest*1.0/totalPeople*100;

        System.out.printf("%.2f%%%n",musalaClimber);
        System.out.printf("%.2f%%%n",monblanClimber);
        System.out.printf("%.2f%%%n",kilimanjClimber);
        System.out.printf("%.2f%%%n",k2Climber);
        System.out.printf("%.2f%%%n",evrestClimber);
    }
}
