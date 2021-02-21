package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double printOnePage = Double.parseDouble(scanner.nextLine());
        double printOneCover = Double.parseDouble(scanner.nextLine());
        double  percentDiscountPrintPaper= Double.parseDouble(scanner.nextLine());
        double pricePayForDesigner = Double.parseDouble(scanner.nextLine());
        double percentFromAllSumFromTeam = Double.parseDouble(scanner.nextLine());

        double price = printOnePage * 899 + printOneCover * 2;

        price = price - (price * percentDiscountPrintPaper / 100);
        price = price + pricePayForDesigner;
        price = price - ( price * percentFromAllSumFromTeam / 100);

        System.out.printf("Avtonom should pay %.2f BGN.",price);
    }
}
