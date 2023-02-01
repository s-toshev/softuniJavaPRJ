package ForLoopExercise0004;

import java.util.Scanner;

public class trekMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;
        for (int i = 1; i <=n ; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople=totalPeople+peopleInGroup;
            if (peopleInGroup<=5){
                musala = musala+peopleInGroup;
            }else if (peopleInGroup<=12){
                monblan=monblan+peopleInGroup;
            }else if(peopleInGroup<=25){
                kilimanjaro=kilimanjaro+peopleInGroup;
            }else if (peopleInGroup<=40){
                k2=k2+peopleInGroup;
            }else {
                everest=everest+peopleInGroup;
            }
        }

        System.out.printf("%.2f%%%n",musala*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",monblan*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",kilimanjaro*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",k2*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",everest*1.0/totalPeople*100);


    }
}
