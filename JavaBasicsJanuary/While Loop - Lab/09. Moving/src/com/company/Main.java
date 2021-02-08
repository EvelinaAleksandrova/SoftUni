package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int boxesSum = 0;
        int volumeOfHouse = width * length * height;
        while (!input.equals("Done")) {

            int boxes = Integer.parseInt(input);
            boxesSum = boxesSum + boxes;
            if (boxesSum >= volumeOfHouse) {
                break;
            }
            input = scanner.nextLine();
        }
        int difference = Math.abs(volumeOfHouse - boxesSum);
        if (boxesSum < volumeOfHouse) {
            System.out.printf("%d Cubic meters left.", difference);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", difference);
        }
    }
}
