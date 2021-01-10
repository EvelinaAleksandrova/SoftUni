package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPagesInCurrentBook = Integer.parseInt(scanner.nextLine());
        int numberOfPagesReadFor1Hour = Integer.parseInt(scanner.nextLine());
        int daysForReadingTheBook = Integer.parseInt(scanner.nextLine());

        int sumOfTimeForReadingBook = numberOfPagesInCurrentBook / numberOfPagesReadFor1Hour;
        int sumOfHours = sumOfTimeForReadingBook / daysForReadingTheBook;

        System.out.println(sumOfHours);

    }
}
