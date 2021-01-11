package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKgFruits = Double.parseDouble(scanner.nextLine());
        double kgOfVegetables = Double.parseDouble(scanner.nextLine());
        double kgOfFruits = Double.parseDouble(scanner.nextLine());

        double oneEuroInLev = 1.94;

        double vegetablesCost = priceForKgVegetables * kgOfVegetables;
        double fruitsCost = priceForKgFruits * kgOfFruits;
	    double sumInLev = vegetablesCost + fruitsCost;
        double sumInEuro = sumInLev / oneEuroInLev;
        
        System.out.printf("%.2f", sumInEuro);

    }
}
