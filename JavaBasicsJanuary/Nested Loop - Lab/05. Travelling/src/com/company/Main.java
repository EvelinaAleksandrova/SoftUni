package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String destination = input;
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            double sum = 0.0;

            while (sum < minimalBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                sum = sum + money;
            }
            System.out.println("Going to " + destination + "!");
            input = scanner.nextLine();
        }
    }
}
