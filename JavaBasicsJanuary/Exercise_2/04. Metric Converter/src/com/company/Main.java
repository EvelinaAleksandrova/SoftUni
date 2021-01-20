package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();

        double oneMeterToMillimeters = 1000;
        double oneMeterToCentimeters = 100;

        if(inputUnit.equals("mm")){
          number = number / oneMeterToMillimeters;
        }else if(inputUnit.equals("cm")){
            number = number / oneMeterToCentimeters;
        }

        if(outputUnit.equals("mm")){
            number = number * oneMeterToMillimeters;
        }else if(outputUnit.equals("cm")){
            number = number * oneMeterToCentimeters;
        }
        System.out.printf("%.3f", number);
    }
}
