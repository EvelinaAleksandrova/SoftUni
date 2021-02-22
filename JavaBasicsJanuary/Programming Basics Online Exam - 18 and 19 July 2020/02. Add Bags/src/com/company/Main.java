package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForLuggageFor20Kilograms = Double.parseDouble(scanner.nextLine());
        double kilogramsLuggage = Double.parseDouble(scanner.nextLine());
        int daysBeforeJourney = Integer.parseInt(scanner.nextLine());
        int numberOfLuggage = Integer.parseInt(scanner.nextLine());

        double discount = 0.0;
        double sum = 0.0;

        if (kilogramsLuggage < 10) {
            discount = priceForLuggageFor20Kilograms - (priceForLuggageFor20Kilograms * 0.2);
        } else if (kilogramsLuggage >= 10 && kilogramsLuggage <= 20) {
            discount = priceForLuggageFor20Kilograms - (priceForLuggageFor20Kilograms * 0.5);
        } else if (kilogramsLuggage > 20) {
            discount = priceForLuggageFor20Kilograms;
        }
        if (daysBeforeJourney < 7) {
            sum = discount + (discount * 0.4);
        } else if (daysBeforeJourney >= 7 && daysBeforeJourney <= 30) {
            sum = discount + (discount * 0.15);
        } else if (daysBeforeJourney > 30) {
            sum = discount + (discount * 0.10);
        }
        sum *= numberOfLuggage;
        System.out.printf("The total price of bags is: %.2f lv. ", sum);
    }
}
