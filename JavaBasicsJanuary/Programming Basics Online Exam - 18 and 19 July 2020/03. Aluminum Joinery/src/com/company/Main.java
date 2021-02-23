package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfJoinery = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String typeOfDelivery = scanner.nextLine();

        double priceOfDelivery = 60;
        double price = 0.0;

        if (typeOfJoinery.equals("90X130")) {
            price = numberOfJoinery * 110;
            if (numberOfJoinery > 30 && numberOfJoinery <= 60) {
                price = price - (price * 0.05);
            } else if (numberOfJoinery > 60) {
                price = price - (price * 0.08);
            }
        } else if (typeOfJoinery.equals("100X150")) {
            price = numberOfJoinery * 140;
            if (numberOfJoinery > 40 && numberOfJoinery <= 80) {
                price = price - (price * 0.06);
            } else if (numberOfJoinery > 80) {
                price = price - (price * 0.1);
            }
        } else if (typeOfJoinery.equals("130X180")) {
            price = numberOfJoinery * 190;
            if (numberOfJoinery > 20 && numberOfJoinery >= 80) {
                price = price - (price * 0.07);
            } else if (numberOfJoinery > 50) {
                price = price - (price * 0.12);
            }
        } else if (typeOfJoinery.equals("200X300")) {
            price = numberOfJoinery * 250;
            if (numberOfJoinery > 25 && numberOfJoinery <= 50) {
                price = price - (price * 0.09);
            } else if (numberOfJoinery > 50) {
                price = price - (price * 0.14);
            }
        }
        if (typeOfDelivery.equals("With delivery")) {
            price += priceOfDelivery;
        }
        if(numberOfJoinery > 99){
            price = price - (price * 0.04);
        }
        if(numberOfJoinery > 10){
            System.out.printf("%.2f BGN",price);
        }else{
            System.out.println("Invalid order");
        }
    }
}
