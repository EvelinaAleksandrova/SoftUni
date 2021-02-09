package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWorseGrade = Integer.parseInt(scanner.nextLine());
        double sumGrades = 0.0;
        int counterWorstGrades = 0;
        int counterGrades = 0;
        String lastTask = " ";

        while (counterWorstGrades < numberOfWorseGrade) {
            String nameOfCurrentTasks = scanner.nextLine();

            if (nameOfCurrentTasks.equals("Enough")) {
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                counterWorstGrades++;
            }
            lastTask = nameOfCurrentTasks;
            counterGrades++;
            sumGrades = sumGrades + grade;
        }
        double averageGrade = sumGrades / counterGrades;
        if (counterWorstGrades == numberOfWorseGrade) {
            System.out.printf("You need a break, %d poor grades.", counterWorstGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.println("Number of problems: " + counterGrades);
            System.out.println("Last problem: " + lastTask);
        }
    }
}
