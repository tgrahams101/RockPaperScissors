package com.company;

import java.util.Scanner;

public class RockPaperScissors {

    private static int gamesPlayed = 0;

    public static void startGameModule(Scanner scanner) {

        boolean active = false;
        System.out.println("Would you like to play Rock, Paper, Scissors?");
        String answer = scanner.next();
        if (!answer.toLowerCase().equals("no")) {
            active = true;
        }

        //log number of times RPS game played!
        System.out.println(RockPaperScissors.getGamesPlayed());

        Game game = new Game();
        game.play(scanner);

    }

    public static int getGamesPlayed() {
        return gamesPlayed;
    }

    public static void incrementGamesPlayed() {
        gamesPlayed++;
    }
}
