package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        double weekends = Double.parseDouble(scanner.nextLine());

        double volleyballTime = 0.0;
        volleyballTime += (48 - weekends) * 3.0 / 4;
        volleyballTime += holidays * 2.0 / 3;
        volleyballTime += weekends;

        if (year.equals("leap")) {
            volleyballTime *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(volleyballTime));
    }
}
