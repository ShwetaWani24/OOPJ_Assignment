package org.example;

import java.util.Scanner;

class CompoundInterestCalculator {
    private double initial_amount;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    private double futureValue;
    private double totalInterest;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial investment in ₹: ");
        initial_amount = sc.nextDouble();
        System.out.print("Enter Annual interest rate in %: ");
        annualInterestRate = sc.nextDouble();
        System.out.print("Enter number of times the interest is compounded per year: ");
        numberOfCompounds = sc.nextInt();
        System.out.print("Enter investment duration in years: ");
        years = sc.nextInt();
        sc.close();
    }

    public void calculateFutureValue() {
        double rate = annualInterestRate / 100;
        futureValue = initial_amount * Math.pow((1 + rate / numberOfCompounds), numberOfCompounds * years);
        totalInterest = futureValue - initial_amount;
    }

    public void printRecord() {
        System.out.printf("Future Value: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
    }
}

public class Program2 {
    public static void main(String[] args) {
        CompoundInterestCalculator ci = new CompoundInterestCalculator();
        ci.acceptRecord();
        ci.calculateFutureValue();
        ci.printRecord();
    }
}
