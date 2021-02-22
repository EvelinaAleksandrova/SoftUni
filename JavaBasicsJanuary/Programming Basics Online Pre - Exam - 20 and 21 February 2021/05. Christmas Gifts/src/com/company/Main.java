package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKids = 0;
        int numberOfAdults = 0;

        String input = " ";
        while (true) {
            input = scanner.nextLine();
            if (input.equals("Christmas")) {
                break;
            }
            int ageOfPeople = Integer.parseInt(input);
            if (ageOfPeople <= 16) {
                numberOfKids++;
            } else if (ageOfPeople > 16) {
                numberOfAdults++;
            }
        }
        int priceForAllToys = numberOfKids * 5;
        int priceForAllSweaters = numberOfAdults * 15;

        System.out.println("Number of adults: " + numberOfAdults);
        System.out.println("Number of kids: " + numberOfKids);
        System.out.println("Money for toys: " + priceForAllToys);
        System.out.println("Money for sweaters: " + priceForAllSweaters);
    }
}
