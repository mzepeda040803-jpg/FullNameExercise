package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class SplitExample {
    public static void main(String[] args) {

        String input = "Dallas|Ft. Worth| Austin";
        String [] cities = input.split(Pattern.quote("|"));
        System.out.println(cities[1]);


        String numberAsString = "45";
        int number = Integer.parseInt(numberAsString);
        int result = number + 1;
        System.out.println(result);



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
        String userInput = "10/17/2022";
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay.getDayOfWeek());



    }
}
