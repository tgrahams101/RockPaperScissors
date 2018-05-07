package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static int gamesPlayed = 0;

    public static void startGameModule(Scanner scanner) {

        Game game = new Game();
        gamesPlayed++;
        game.play(scanner);

    }

    public static int getGamesPlayed() {
        return gamesPlayed;
    }
}
