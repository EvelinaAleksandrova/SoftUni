package com.company;

import java.util.Scanner;

public class inchesToCentemeters {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double inches = Double.parseDouble(input);

        double result = inches * 2.54;
        System.out.println(result);
    }
}
