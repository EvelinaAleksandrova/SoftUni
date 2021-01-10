package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double bgn = 1.79549;

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        System.out.println(usd * bgn);
    }
}
