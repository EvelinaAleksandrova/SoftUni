package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterCoins = 0;
        double input = Double.parseDouble(scanner.nextLine());
        double money = Math.round(input * 100);

        while (money > 0) {
            if (money >= 200) {
                counterCoins++;
                money -= 200;
            } else if (money >= 100) {
                counterCoins++;
                money -= 100;
            } else if (money >= 50) {
                counterCoins++;
                money -= 50;
            } else if (money >= 20) {
                counterCoins++;
                money -= 20;
            } else if (money >= 10) {
                counterCoins++;
                money -= 10;
            } else if (money >= 5) {
                counterCoins++;
                money -= 5;
            } else if (money >= 2) {
                counterCoins++;
                money -= 2;
            } else if (money >= 1) {
                counterCoins++;
                money -= 1;
            }
        }
        System.out.println(counterCoins);
    }
}
