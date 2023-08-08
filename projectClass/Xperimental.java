package com.projectClass;

import java.util.Scanner;

public class Xperimental {

    public static void main(String[] args) {

//            String[] colour = {"red", "blue", "black", "green"};
//            for (int i = colour.length-1; i >= 0; i--) {
//                System.out.println(colour[i]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your Weight 'in kilograms' here:");
        double bmi, height, weight;
        weight = scanner.nextDouble();

        System.out.println("input your height' in centimeters' here:");
        height = scanner.nextDouble();

        bmi = Math.floor((weight / (height * height)) * 10000);
        System.out.println("your bmi is " + bmi);

        if (bmi <= 18.5) {
            System.out.println("you are underWeight");
        } else if (bmi > 18.5 && bmi <= 24.9) {
            System.out.println("you are healthy");
        } else if (bmi >= 25) {
            System.out.println("you are overWeight");
        } else {
            System.out.println("invalid");
        }
    }
}

