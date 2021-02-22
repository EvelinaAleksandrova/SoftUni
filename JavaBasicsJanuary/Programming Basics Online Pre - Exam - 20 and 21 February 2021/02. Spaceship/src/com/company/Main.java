package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double widthOfShip = Double.parseDouble(scanner.nextLine());
        double lengthOfShip = Double.parseDouble(scanner.nextLine());
        double heightOfShip = Double.parseDouble(scanner.nextLine());
        double averageHeightOfAstronaut = Double.parseDouble(scanner.nextLine());

        int width = 2;
        int length = 2;
        double height = 0.40 + averageHeightOfAstronaut;

        double volumeOfShip = widthOfShip * lengthOfShip * heightOfShip;
        double volumeOfOneRoom = height * width * length;
        double peopleInShip = volumeOfShip / volumeOfOneRoom;
        int totalPeople = (int) Math.floor(peopleInShip);

        if (totalPeople >= 3 && totalPeople <= 10) {
            System.out.printf("The spacecraft holds %d astronauts.", totalPeople);
        } else if (totalPeople < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
