package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNumber = "" + i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j < currentNumber.length(); j++) {

                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j));

                if (j % 2 == 0) {
                    sumEven = sumEven + currentDigit;
                }else{
                    sumOdd = sumOdd + currentDigit;
                }
            }
            if(sumEven == sumOdd){
                System.out.print(i + " ");
            }
        }
    }
}
