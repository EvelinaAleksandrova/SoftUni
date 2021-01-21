package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        if (averageSuccess > 4.50) {
            if (income < minimalSalary) {
                socialScholarship = Math.floor(minimalSalary * 0.35);
            }
        }
        if (averageSuccess >= 5.5) {
            excellentScholarship = Math.floor(averageSuccess * 25);
        }
        if (socialScholarship == 0 && excellentScholarship == 0) {

            System.out.println("You cannot get a scholarship!");
        }else if(socialScholarship > excellentScholarship){
            System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);
        }else if(socialScholarship <= excellentScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",excellentScholarship);
        }
    }
}