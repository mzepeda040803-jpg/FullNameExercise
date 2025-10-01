package com.pluralsight;

import java.util.Scanner;

public class TheaterReservationsClassDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many tickets would you like you use?");
        int ticketAmount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();


      //  3 tickets reserved for 2023-05-13 under Johnson, Geri

        System.out.printf("""
                %d tickets reserved for %s under %s,
                """, ticketAmount, date, name);
    }
}
