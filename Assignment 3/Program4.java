package org.example;

import java.util.Scanner;

class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price of the item (₹): ");
        originalPrice = sc.nextDouble();
        System.out.print("Enter the discount percentage (%): ");
        discountRate = sc.nextDouble();
        sc.close();
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
        System.out.printf("Final Price after Discount: ₹%.2f\n", finalPrice);
    }
}

public class Program4 {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.calculateDiscount();
        calculator.printRecord();
    }
}

