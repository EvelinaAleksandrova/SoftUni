package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfCompany = scanner.nextLine();
        int numberOfTicketsForAdults = Integer.parseInt(scanner.nextLine());
        int numberOfTicketsForKids = Integer.parseInt(scanner.nextLine());
        double priceOfTicketForAdults = Double.parseDouble(scanner.nextLine());
        double priceOfTicketForService = Double.parseDouble(scanner.nextLine());

        double priceOfTicketForKids = priceOfTicketForAdults;
        priceOfTicketForKids = priceOfTicketForKids - (priceOfTicketForKids * 0.7);

        priceOfTicketForAdults += priceOfTicketForService;
        priceOfTicketForKids += priceOfTicketForService;

        double priceForAll = (numberOfTicketsForKids * priceOfTicketForKids) + (numberOfTicketsForAdults * priceOfTicketForAdults);
        priceForAll = priceForAll - (priceForAll * 0.8);
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameOfCompany, priceForAll);
    }
}
