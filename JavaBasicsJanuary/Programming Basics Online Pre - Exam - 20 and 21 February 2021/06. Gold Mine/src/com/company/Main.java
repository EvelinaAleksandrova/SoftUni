package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLocation = Integer.parseInt(scanner.nextLine());
        double allPrice = 0.0;

        for (int i = 1; i <= numberOfLocation; i++) {

            double averageProduce = Double.parseDouble(scanner.nextLine());
            int numberOfDays = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= numberOfDays; j++) {
                double goldForDay = Double.parseDouble(scanner.nextLine());
                allPrice = allPrice + goldForDay;
            }

            double averagePrice = allPrice / numberOfDays;

            if (averagePrice >= averageProduce) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averagePrice);
            }
            else if(averagePrice < averageProduce){
                double diff = averageProduce - averagePrice;
                System.out.printf("You need %.2f gold.%n", diff);
            }
            allPrice = 0.0;
        }
    }
}
