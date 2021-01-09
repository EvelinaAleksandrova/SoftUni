package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	int numberOfProjects = Integer.parseInt(scanner.nextLine());
	int hours = numberOfProjects * 3;
	System.out.println("The architect " + name +" will need " +   hours + " hours to complete "+numberOfProjects+" project/s.");
    }
}
