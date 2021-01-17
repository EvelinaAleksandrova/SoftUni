package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double area = 0;

        if (input.equals("square")) {
            double sideLength = Double.parseDouble(scanner.nextLine());
            area = sideLength * sideLength;

        } else if (input.equals("rectangle")) {
            double width = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = width * height;

        } else if (input.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;

        } else {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (length * height) / 2;
        }
        System.out.printf("%.3f", area);
    }
}
