package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int counter = 0;

        while (!currentBook.equals("No More Books")) {
            if (nameOfBook.equals(currentBook)) {
                break;
            }
            counter++;
            currentBook = scanner.nextLine();
        }
        if (currentBook.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        } else {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
