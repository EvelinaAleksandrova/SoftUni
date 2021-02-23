package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherColor = 0;
        int dividesFromBlackBalls = 0;

        for (int i = 0; i < numberOfBalls; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                redBalls++;
                totalPoints += 5;
            } else if (color.equals("orange")) {
                orangeBalls++;
                totalPoints += 10;
            } else if (color.equals("yellow")) {
                yellowBalls++;
                totalPoints += 15;
            } else if (color.equals("white")) {
                whiteBalls++;
                totalPoints += 20;
            } else if (color.equals("black")) {
                dividesFromBlackBalls++;
                totalPoints /= 2;
            } else {
                otherColor++;
            }
        }
        System.out.println("Total points: " + totalPoints);
        System.out.println("Points from red balls: " + redBalls);
        System.out.println("Points from orange balls: " + orangeBalls);
        System.out.println("Points from yellow balls: " + yellowBalls);
        System.out.println("Points from white balls: " + whiteBalls);
        System.out.println("Other colors picked: " + otherColor);
        System.out.println("Divides from black balls: " + dividesFromBlackBalls);
    }
}
