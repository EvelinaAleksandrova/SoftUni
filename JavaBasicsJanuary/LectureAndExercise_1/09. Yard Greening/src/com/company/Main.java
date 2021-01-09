package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double priceOfOneMeter = 7.61;
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double meters = Double.parseDouble(input);

        double priceWithoutDiscount = priceOfOneMeter * meters;
        double priceWithDiscount = 0.18 * priceWithoutDiscount;
        double finalPrice = priceWithoutDiscount - priceWithDiscount;

        System.out.println("The final price is: " + finalPrice);
        System.out.println("The discount is: " + priceWithDiscount);
    }
}
