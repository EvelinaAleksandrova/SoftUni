package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        days = days - 1;
        double result = 0.0;

        switch (typeOfRoom) {
            case "room for one person":
                result = 18 * days;
                break;
            case "apartment":
                if (days < 10) {
                    result = 25 * days;
                    result = result - (result * 0.30);
                } else if (days >= 10 && days <= 15) {
                    result = 25 * days;
                    result = result - (result * 0.35);
                } else if (days > 15) {
                    result = 25 * days;
                    result = result - (result * 0.50);
                }
                break;
            case "president apartment":
                if (days < 10) {
                    result = 35 * days;
                    result = result - (result * 0.10);
                } else if (days >= 10 && days <= 15) {
                    result = 35 * days;

                    result = result - (result * 0.15);
                } else if (days > 15) {
                    result = 35 * days;
                    result = result - (result * 0.20);
                }
                break;
        }
        if (rating.equals("positive")) {
            result = result + (result * 0.25);
        } else if (rating.equals("negative")) {
            result = result - (result * 0.10);
        }
        System.out.printf("%.2f", result);
    }
}
