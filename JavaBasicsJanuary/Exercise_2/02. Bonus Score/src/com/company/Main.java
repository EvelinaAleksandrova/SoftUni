package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores = Integer.parseInt(scanner.nextLine());

        double bonus = 0;
        if (scores <= 100) {
            bonus = 5;
        } else if (scores > 1000) {
            bonus = scores * 0.1;
        } else {
            bonus = scores * 0.2;
        }
        if (scores % 2 == 0) {
            bonus = bonus + 1;
        } else if (scores % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(scores + bonus);
    }
}
