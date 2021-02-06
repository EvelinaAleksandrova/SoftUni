package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double sum = 0.0;
        while (!input.equals("NoMoreMoney")) {

            double currentNumber = Double.parseDouble(input);
            if (currentNumber < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + currentNumber;
            System.out.printf("Increase: %.2f%n", currentNumber);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
