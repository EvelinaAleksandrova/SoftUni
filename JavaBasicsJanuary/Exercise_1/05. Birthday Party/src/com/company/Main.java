package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentHall = Integer.parseInt(scanner.nextLine());

        double priceForCake = rentHall * 0.2;
        double priceForDrinks = priceForCake - (priceForCake/100) * 45;
        double priceForAnimator = rentHall / 3;

        double finalSum = rentHall + priceForCake + priceForDrinks + priceForAnimator;
        System.out.println(finalSum);
    }
}