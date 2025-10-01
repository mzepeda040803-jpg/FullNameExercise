package com.pluralsight;

import java.util.regex.Pattern;

public class HighScoreWinsEX {
    public static void main(String[] args) {

        String input = "Home:Visitor|21:9";
        String [] parts = input.split("\\|");
        String [] teams = parts [0].split (":");
        String [] scores = parts [1].split(":");
        String homeTeam = teams [0];
        String visitorTeam = teams [1];
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        System.out.printf("%s scored %d, %s scored %d%n", homeTeam, homeScore, visitorTeam, visitorTeam);




        String[] score = input.split(Pattern.quote("\\|"));



       // String teams = "Home:Visitor";
      //  teams [2] = "Visitor";
       // String scores = "21:9";

       // teams [1] = "Home";

       // String [] teams = input.split(Pattern.quote(":"));
        //System.out.println(score);























       // String input = "Dallas|Ft. Worth| Austin";
     //   String [] cities = input.split(Pattern.quote("|"));
      //  System.out.println(cities[1]);

        //


    }
}
