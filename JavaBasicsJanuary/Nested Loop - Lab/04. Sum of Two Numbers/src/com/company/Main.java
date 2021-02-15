package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counterCombinations = 0;
        int sum = 0;
        int first, second = 0;
        boolean flag = false;

        for (first = startInterval; first <= endInterval; first++) {
            for (second = startInterval; second <= endInterval; second++) {
                sum = first + second;
                counterCombinations++;
                if (sum == magicNumber) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (sum == magicNumber) {
            System.out.printf("Combination N:%d", counterCombinations);
            System.out.printf(" (%d + %d = %d)", first, second, sum);
        } else {
            System.out.printf("%d combinations - neither equals %d", counterCombinations, magicNumber);
        }
    }
}
