package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counterAllTickets = 0;
        int counterStudentTicket = 0;
        int counterStandardTicket = 0;
        int counterKidTicket = 0;

        while (true) {
            String nameOfFilm = scanner.nextLine();

            if (nameOfFilm.equals("Finish")) {
                break;
            }
            int capacity = Integer.parseInt(scanner.nextLine());
            int sumTickets = 0;
            int freeSeats = capacity;

            while (freeSeats > 0) {
                String typeOfTicket = scanner.nextLine();

                if (typeOfTicket.equals("End")) {
                    break;
                }
                switch (typeOfTicket){
                    case "standard":
                        counterStandardTicket++;
                        break;
                    case"student":
                        counterStudentTicket++;
                        break;
                    case"kid":
                        counterKidTicket++;
                        break;
                }
                sumTickets++;
                freeSeats--;
            }
            counterAllTickets += sumTickets;
            double percent = (sumTickets * 1.0) / capacity* 100;
            System.out.printf("%s - %.2f%% full.%n", nameOfFilm, percent);
        }
        System.out.printf("Total tickets: %d%n",counterAllTickets);
        System.out.printf("%.2f%% student tickets.%n", counterStudentTicket * 1.0 / counterAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", counterStandardTicket * 1.0 / counterAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", counterKidTicket * 1.0 / counterAllTickets * 100);
    }
}
