package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCampaign = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numbersOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double priceOfCakes = numbersOfCakes * 45;
        double priceOfWaffles = numberOfWaffles * 5.80;
        double priceOfPancakes = numberOfPancakes * 3.20;

        double sumForOneDayOfAllBakers = (priceOfCakes + priceOfWaffles + priceOfPancakes) * numberOfBakers;
        double sumOfAllCampaign = sumForOneDayOfAllBakers * daysCampaign;
        double sumAfterSpending = sumOfAllCampaign - (sumOfAllCampaign / 8);

        System.out.printf("%.2f", sumAfterSpending);


    }
}
