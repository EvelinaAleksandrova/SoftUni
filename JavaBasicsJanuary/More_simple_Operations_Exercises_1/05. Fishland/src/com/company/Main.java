package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForMackerelForKg = Double.parseDouble(scanner.nextLine());
        double priceForSpratsForKg = Double.parseDouble(scanner.nextLine());
        double kgBonito = Double.parseDouble(scanner.nextLine());
        double kgHorseMackerel = Double.parseDouble(scanner.nextLine());
        double kgMussels = Double.parseDouble(scanner.nextLine());

        double priceForKgBonito = priceForMackerelForKg + priceForMackerelForKg * 0.60;
        double sumBonito = kgBonito * priceForKgBonito;

        double priceForKgHorseMackerel = priceForSpratsForKg + priceForSpratsForKg * 0.80;
        double sumHorseMackerel = kgHorseMackerel * priceForKgHorseMackerel;

        double sumMussels = kgMussels * 7.50;
        double finalSum = sumBonito + sumHorseMackerel + sumMussels;

        System.out.printf("%.2f", finalSum);
    }
}
