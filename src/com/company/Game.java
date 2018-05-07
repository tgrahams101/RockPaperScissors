package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public void play(Scanner scanner) {

        System.out.println("Welcome to Rock Paper Scissors! \n ");
        System.out.println("Do you want to play 1v1, otherwise we'll match you up with the computer");
        String is1v1 = scanner.next().toLowerCase();
        if (is1v1 == "yes") {

        } else {
            System.out.println("You have been matched up with the computer!");
            String[] rpsChoices = {"rock", "paper", "scissors"};
            System.out.println("Enter your choice for RPS");
            String choice = scanner.next().toLowerCase();
            Random random = new Random();
            int randomInteger = random.nextInt(2);
            System.out.println("RANDOM INTEGER IS " + randomInteger);
            String cpuChoice = rpsChoices[randomInteger].toLowerCase();
            System.out.println("cpu Choice is " + cpuChoice );
            System.out.println("My choice tho is " + choice);
            if (choice.toLowerCase().equals(cpuChoice.toLowerCase())) {
                System.out.println("Ya'll tied");
            } else if (choice.equals("rock")) {
                if (cpuChoice.equals("paper")) {
                    System.out.println("YOU LOST BRO!");
                } else if (cpuChoice.equals("scissors")) {
                    System.out.println("YESSIR, WE GOTTA WINNER OVER HERE");
                }
            } else if (choice.equals("paper")) {
                if (cpuChoice.equals("rock")) {
                    System.out.println("YESSIR, WE GOTTA WINNER OVER HERE");
                } else if (cpuChoice.equals("scissors")) {
                    System.out.println("YOU LOST BRO!");
                }
            } else if (choice.equals("scissors")) {
                if (cpuChoice.equals("rock")) {
                    System.out.println("YOU LOST BRO!");
                } else if (cpuChoice.equals("paper")) {
                    System.out.println("YESSIR, WE GOTTA WINNER OVER HERE");
                }
            } else {
                System.out.println("INVALID INPUT, TRY AGAIN");
            }
        }
    }

}
