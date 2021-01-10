package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeOfAquarium = length * width * height;
        double sumOfLiters = volumeOfAquarium * 0.001;
        double percents = percent * 0.01;
        double litersForAquarium = sumOfLiters * (1 - percents);

        System.out.printf("%.2f", litersForAquarium);
    }
}
