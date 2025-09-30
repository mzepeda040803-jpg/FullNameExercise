package Fullnameexercise;

import java.util.Scanner;

public class FullNameEx {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String fullName = myscanner.nextLine();
        System.out.println(fullName);

    }
}
