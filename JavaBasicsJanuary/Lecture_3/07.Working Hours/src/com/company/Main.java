package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) -
        // въведени от потребителя и проверява дали офисът на фирма е отворен,
        // като работното време на офисът е от 10-18 часа, от понеделник до събота включително
        //open  closed

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                case "Sunday":
                    System.out.println("closed");
                    break;
            }
        } else {
            System.out.println("closed");
        }
    }
}
