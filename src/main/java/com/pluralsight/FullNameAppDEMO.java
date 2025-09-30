package com.pluralsight;

import java.util.Scanner;

public class FullNameAppDEMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();


        System.out.println("Middle Name: ");
        String middleName = scanner.nextLine();


        System.out.println("Last name: ");
        String lastName = scanner.nextLine();


        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        fullName = fullName + ", " + suffix + lastName + middleName + firstName;

        System.out.println(fullName);


    }
}
