package com.company;

import java.util.Scanner;

public class PvPGame extends Game {

    public static void execute1v1Round(Scanner scanner, Player player1, Player player2) {
        System.out.println("Player 1, choose one from Rock, Paper, Scissors!");
        String player1Choice = scanner.next().toLowerCase();
        System.out.println("Player 2, choose one from Rock, Paper, Scissors!");
        String player2Choice = scanner.next().toLowerCase();

        String player1Outcome = determineWinner(player1Choice, player2Choice);
        String player2Outcome = determineWinner(player2Choice, player1Choice);

        if (player1Outcome.equals("invalid") || player2Outcome.equals("invalid")) {
            System.out.println("Invalid input from at least one player. Game rendered void");
        } else if (player1Outcome.equals("tied")) {
            player1.incrementGamesTied();
            player2.incrementGamesTied();
            System.out.println("You both tied! You both played " + player1Choice + ".");
        } else if (player1Outcome.equals("won")) {
            player1.incrementGamesWon();
            player2.incrementGamesLost();
            System.out.println("Player 1 Won! Player 1 played " + player1Choice + ", while Player 2 played " + player2Choice + ".");
        } else if (player1Outcome.equals("lost")) {
            player1.incrementGamesLost();
            player2.incrementGamesWon();
            System.out.println("Player 2 Won! Player 2 played " + player1Choice + ", while Player 1 played " + player1Choice + ".");
        }
    }
}
