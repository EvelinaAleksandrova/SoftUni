package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double counter1 = 0.0;
        double counter2 = 0.0;
        double counter3 = 0.0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                counter1++;
            }
            if (number % 3 == 0) {
                counter2++;
            }
            if (number % 4 == 0) {
                counter3++;
            }
        }
        double p1 = counter1 / n * 100;
        double p2 = counter2 / n * 100;
        double p3 = counter3 / n * 100;

        System.out.printf("%.2f", p1);
        System.out.println("%");
        System.out.printf("%.2f", p2);
        System.out.println("%");
        System.out.printf("%.2f", p3);
        System.out.println("%");
    }
}
