package com.company;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int a = Integer.parseInt(input);
        System.out.println(a*a);

    }
}
