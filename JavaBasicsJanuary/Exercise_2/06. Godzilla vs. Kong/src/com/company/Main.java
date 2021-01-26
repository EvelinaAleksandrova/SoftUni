package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetForFilm = Double.parseDouble(scanner.nextLine());
        int numberOfExtras = Integer.parseInt(scanner.nextLine());
        double priceForClothingForExtras = Double.parseDouble(scanner.nextLine());

        double priceForDecor = (budgetForFilm * 0.1);
        double sumForClothing = priceForClothingForExtras * numberOfExtras;

        if (numberOfExtras > 150) {
            sumForClothing = sumForClothing - (sumForClothing * 0.1);
        }
        double totalMoney = sumForClothing + priceForDecor;
        double moneyLeft = budgetForFilm - totalMoney;

        if (totalMoney > budgetForFilm) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(moneyLeft));
        } else if (totalMoney <= budgetForFilm) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}
