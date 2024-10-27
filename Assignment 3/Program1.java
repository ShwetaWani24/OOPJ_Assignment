package org.example;

import java.util.Scanner;

class LoanAmortizationCalculator {
    private double monthlyPayment;
    private double loan_amount;
    private double annual_interest;
    private int loan_term;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Loan Amount (₹): ");
        this.loan_amount = sc.nextDouble();
        System.out.print("Annual Interest Rate (%): ");
        this.annual_interest = sc.nextDouble();
        System.out.print("Loan Term (in years): ");
        this.loan_term = sc.nextInt();
        sc.close();
    }

    public void calculate_monthly_payment() {
        double monthlyInterestRate = annual_interest / 12 / 100;
        int numberOfMonths = loan_term * 12;
        monthlyPayment = loan_amount * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths)) /
                (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1);
    }

    public void printRecord() {
        double totalPayment = monthlyPayment * loan_term * 12;
        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Payment over the life of the loan: ₹%.2f\n", totalPayment);
    }
}

public class Program1 {

    public static void main(String[] args) {
        LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
        lac.acceptRecord();
        lac.calculate_monthly_payment();
        lac.printRecord();
    }
}
