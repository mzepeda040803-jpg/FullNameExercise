package com.pluralsight;

import java.util.Scanner;

public class TheaterReservationsClassDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyy):");
        String date = scanner.nextLine();

        System.out.println("How many tickets would you like you use?");
        int ticketAmount = scanner.nextInt();


        System.out.printf("""
                Name: %s,
                Date: %s,
                Number of tickets: %d,
                """, name, date, ticketAmount);
    }
}
