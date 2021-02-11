package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int size = length * width;

        while (size > 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int slices = Integer.parseInt(input);
            size = size - slices;
        }
        int difference = Math.abs(size);
        if (size < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", difference);
        } else {
            System.out.printf("%d pieces are left.",size);
        }
    }
}
