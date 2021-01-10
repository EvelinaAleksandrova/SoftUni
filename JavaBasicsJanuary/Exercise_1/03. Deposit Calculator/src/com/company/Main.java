package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumOfDeposit = Double.parseDouble(scanner.nextLine());
        int termOfDepositInMonths = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double accruedInterest = sumOfDeposit * annualInterestRate / 100;
        double interestForMonth = accruedInterest / 12;
        double finalSum = sumOfDeposit + (termOfDepositInMonths * interestForMonth);

        System.out.println(finalSum);
    }
}
