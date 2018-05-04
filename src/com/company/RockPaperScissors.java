package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void testScanner(Scanner scanner) {
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
