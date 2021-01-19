package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double priceForPuzzle = 2.60;
        double priceForTalkingDoll = 3;
        double priceForTeddyBear = 4.10;
        double priceForMinion = 8.20;
        double priceForTruck = 2;
        Scanner scanner = new Scanner(System.in);
        
        double priceForExcursion = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfTalkingDolls = Integer.parseInt(scanner.nextLine());
        int numberOfTeddyBear = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTruck = Integer.parseInt(scanner.nextLine());

        double sumPuzzles = priceForPuzzle * numberOfPuzzles;
        double sumTalkingDolls = priceForTalkingDoll * numberOfTalkingDolls;
        double sumTeddyBear = priceForTeddyBear * numberOfTeddyBear;
        double sumMinions = priceForMinion * numberOfMinions;
        double sumTruck = priceForTruck * numberOfTruck;

        double allSum = sumPuzzles + sumTalkingDolls + sumTeddyBear + sumMinions + sumTruck;
        double numberOfToys = numberOfPuzzles + numberOfTalkingDolls + numberOfTeddyBear + numberOfMinions + numberOfTruck;

        if (numberOfToys >= 50) {
            allSum = allSum - (allSum * 0.25);
        }
        allSum = allSum - (allSum * 0.10);

        if (allSum >= priceForExcursion) {
            System.out.printf("Yes! %.2f lv left.", allSum - priceForExcursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceForExcursion - allSum);
        }
    }
}
