package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForSwimmingOneMeter = Double.parseDouble(scanner.nextLine());

        double metersSwim = distanceInMeters * timeInSecondsForSwimmingOneMeter;
        double timePlus = Math.floor(distanceInMeters / 15) * 12.5;

        double totalTime = metersSwim + timePlus;

        if (recordInSeconds <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
