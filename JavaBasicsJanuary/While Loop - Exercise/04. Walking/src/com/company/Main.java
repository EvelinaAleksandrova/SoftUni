package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goalSteps = 10000;
        int sumSteps = 0;

        while (sumSteps < goalSteps) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int stepsGoingHome = Integer.parseInt(scanner.nextLine());
                sumSteps += stepsGoingHome;
                break;
            }
            int steps = Integer.parseInt(input);
            sumSteps = sumSteps + steps;
        }
        int difference = 0;

        if (sumSteps >= goalSteps) {
            difference = sumSteps - goalSteps;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", difference);
        } else {
            difference = goalSteps - sumSteps;
            System.out.printf("%d more steps to reach goal.", difference);
        }
    }
}
