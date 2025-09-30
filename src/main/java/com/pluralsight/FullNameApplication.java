package com.pluralsight;

import java.util.Scanner;

//import static com.sun.tools.javac.tree.TreeInfo.fullName;


public class FullNameApplication {
    public static void main(String[] args){
        fullName();
        Scanner myscanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = myscanner.nextLine();
        firstName = firstName.trim();

        System.out.println(" ");
        System.out.println("what is your middle initial?");
        String middleInitial = myscanner.nextLine();
        middleInitial = middleInitial.trim();

        System.out.println(" ");
        System.out.println("What is your last name?");
        String lastName = myscanner.nextLine();
        lastName = lastName.trim();

        System.out.println(" ");
        System.out.println("what is your suffix?");
        String suffix = myscanner.nextLine();
        suffix = suffix.trim();

        String fullName = String.format("%s, %s, %s, %s", lastName, firstName, middleInitial, suffix);
        System.out.println(fullName);






    }

    private static void fullName() {
    }


}
