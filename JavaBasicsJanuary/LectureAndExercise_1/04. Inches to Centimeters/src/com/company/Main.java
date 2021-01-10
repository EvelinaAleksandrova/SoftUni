package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();

	double inches = Double.parseDouble(input);
	double centimeters = 2.54;
	System.out.println(inches * centimeters);
    }
}
