package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numOfAnimals = scanner.nextLine();
        int numberOfAnimals = Integer.parseInt(numOfAnimals);

        String numOfOtherAnimals = scanner.nextLine();
        int numberOfOtherAnimals = Integer.parseInt(numOfOtherAnimals);

        double priceOfDogFood = 2.50;
        double priceOfOthersFood = 4;

        double result1 = priceOfDogFood * numberOfAnimals;
        double result2 = priceOfOthersFood * numberOfOtherAnimals;
        System.out.println(result1 + result2 + " lv.");
    }
}
