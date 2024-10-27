package org.example;
import java.util.Scanner;

class BMITracker {
    private double weight;
    private double height;
    private double bmi;
    private String classification;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (in kilograms): ");
        weight = sc.nextDouble();
        System.out.print("Enter height (in meters): ");
        height = sc.nextDouble();
        sc.close();
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    public void printRecord() {
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("BMI Classification: " + classification);
    }
}

public class Program3 {
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();
    }
}

