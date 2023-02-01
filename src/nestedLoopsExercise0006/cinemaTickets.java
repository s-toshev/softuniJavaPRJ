package nestedLoopsExercise0006;

import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        int countTotalTickets = 0;
        int countStudentTicket=0;
        int countStdTicket=0;
        int countKidTicket=0;
        while(!command.equals("Finish")){
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeOfTicket = scanner.nextLine();
            int countCurrentTickets=0;
            while(!typeOfTicket.equals("End")){
            countCurrentTickets++;
            countTotalTickets++;

            if(typeOfTicket.equals("standard")){
                countStdTicket++;
            }else if (typeOfTicket.equals("student")){
                        countStudentTicket++;
                    }else if (typeOfTicket.equals("kid")){
                            countKidTicket++;
                        }
            if(countCurrentTickets>=freeSeats){
                break;
            }
                typeOfTicket= scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",movieName,
                    countCurrentTickets*1.0/freeSeats*100);
            command= scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n",countStudentTicket*1.0/countTotalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",countStdTicket*1.0/countTotalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",countKidTicket*1.0/countTotalTickets*100);
    }
}
