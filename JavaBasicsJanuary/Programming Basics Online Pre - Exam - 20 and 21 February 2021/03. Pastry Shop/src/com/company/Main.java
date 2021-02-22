package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cakeName = scanner.nextLine();
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int dayBeforeChristmas = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double discount = 0.0;

        switch (cakeName) {
            case "Cake":
                if (dayBeforeChristmas <= 15) {
                    price = numberOfCakes * 24;
                } else if (dayBeforeChristmas > 15) {
                    price = numberOfCakes * 28.70;
                }
                if (dayBeforeChristmas <= 22) {
                    if (price > 100 && price <= 200) {
                        discount = 0.15;
                        price = price - (price * discount);
                    } else if (price > 200) {
                        discount = 0.25;
                        price = price - (price * discount);
                    }
                }
                if (dayBeforeChristmas <= 15) {
                    discount = 0.10;
                    price = price - (price * discount);
                }
                break;
            case "Souffle":
                if (dayBeforeChristmas <= 15) {
                    price = numberOfCakes * 6.66;
                } else if (dayBeforeChristmas > 15) {
                    price = numberOfCakes * 9.80;
                }
                if (dayBeforeChristmas <= 22) {
                    if (price > 100 && price <= 200) {
                        discount = 0.15;
                        price = price - (price * discount);
                    } else if (price > 200) {
                        discount = 0.25;
                        price = price - (price * discount);
                    }
                }
                if (dayBeforeChristmas <= 15) {
                    discount = 0.10;
                    price = price - (price * discount);
                }
                break;
            case "Baklava":
                if (dayBeforeChristmas <= 15) {
                    price = numberOfCakes * 12.60;
                } else if (dayBeforeChristmas > 15) {
                    price = numberOfCakes * 16.98;
                }
                if (dayBeforeChristmas <= 22) {
                    if (price > 100 && price <= 200) {
                        discount = 0.15;
                        price = price - (price * discount);
                    } else if (price > 200) {
                        discount = 0.25;
                        price = price - (price * discount);
                    }
                }
                if (dayBeforeChristmas <= 15) {
                    discount = 0.10;
                    price = price - (price * discount);
                }
                break;
        }
        System.out.printf("%.2f", price);
    }
}
