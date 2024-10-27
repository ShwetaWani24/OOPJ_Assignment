package org.example;

import java.util.Scanner;

class TollBoothRevenueManager {
    private double car_toll;
    private double truck_toll;
    private double motorcycle_toll;
    private int car_pass;
    private int truck_pass;
    private int motorcycle_pass;
    private double total_toll;
    private int total_vehicle_pass;

    Scanner sc = new Scanner(System.in);

    public void acceptRecord() {
        System.out.print("Enter how many Cars passed: ");
        car_pass = sc.nextInt();
        System.out.print("Enter how many Trucks passed: ");
        truck_pass = sc.nextInt();
        System.out.print("Enter how many Motorcycles passed: ");
        motorcycle_pass = sc.nextInt();
    }

    public void setTollRates() {
        System.out.print("Set Toll Rate for Car (₹): ");
        car_toll = sc.nextDouble();
        System.out.print("Set Toll Rate for Truck (₹): ");
        truck_toll = sc.nextDouble();
        System.out.print("Set Toll Rate for Motorcycle (₹): ");
        motorcycle_toll = sc.nextDouble();
    }

    public void calculateRevenue() {
        total_toll = car_pass * car_toll + truck_pass * truck_toll + motorcycle_pass * motorcycle_toll;
    }

    public void printRecord() {
        total_vehicle_pass = car_pass + truck_pass + motorcycle_pass;
        System.out.println("Total number of vehicles: " + total_vehicle_pass);
        System.out.printf("Total revenue collected: ₹%.2f\n", total_toll);
    }
}

public class Program5 {
    public static void main(String[] args) {
        TollBoothRevenueManager toll = new TollBoothRevenueManager();
        toll.setTollRates();
        toll.acceptRecord();
        toll.calculateRevenue();
        toll.printRecord();
    }
}
