package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number < minNum) {
                minNum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
