package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String[] rpsChoices = {"rock", "paper", "scissors"};
    public void play(Scanner scanner) {

        System.out.println("Welcome to Rock Paper Scissors! \n It'll be fun!");
        System.out.println("Do you want to play 1v1? If yes, type yes. Otherwise type any other key and we'll match you up with the computer");
        String is1v1 = scanner.next().toLowerCase();
        System.out.println(is1v1);
        if (is1v1.equals("yes") || is1v1.equals("yeah")) {
            Player player1 = new Player();
            Player player2 = new Player();
            System.out.println("This is a 1 v 1 Game!");
            boolean continuePlaying = true;

                while (continuePlaying){
                    execute1v1Round(scanner, player1, player2);
                    RockPaperScissors.incrementGamesPlayed();
                    System.out.println("Player 1 has " + player1.getGamesWon() + " wins, " + player1.getGamesLost() + " losses, and " + player1.getGamesTied() + " ties." );
                    System.out.println("Player 2 has " + player2.getGamesWon() + " wins, " + player2.getGamesLost() + " losses, and " + player2.getGamesTied() + " ties." );
                    System.out.println("Do you want to play another round between you too? To discontinue playing, type 'no', otherwise type any other word");
                    String playAgain = scanner.next().toLowerCase();
                    if (playAgain.equals("no")) {
                        continuePlaying = false;
                        System.out.println("Goodbye. No more rematches for now.");
                    } else {
                        System.out.println("You two will be matched again for another round of Rock, Paper, Scissors.");
                    }

                }


        } else {
            System.out.println("You have been matched up with the computer!");
            boolean continuePlayingAgainstCPU = true;
            Player player1 = new Player();
            while (continuePlayingAgainstCPU) {
                executeRoundAgainstCPU(scanner, player1);
                RockPaperScissors.incrementGamesPlayed();
                System.out.println("Continue playing against Computer? Type no if no. Type any other word to continue.");
                String playAgain = scanner.next().toLowerCase();
                if (playAgain.equals("no")) {
                    continuePlayingAgainstCPU = false;
                    System.out.println("See you later.");
                } else {
                    System.out.println("You will be matched against the CPU for another game. Good luck!");
                }

            }

        }
    }

    private void execute1v1Round(Scanner scanner, Player player1, Player player2) {
        System.out.println("Player 1, Enter your choice for RPS");
        String player1Choice = scanner.next().toLowerCase();
        System.out.println("Player 2, Enter your choice for RPS");
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

    private void executeRoundAgainstCPU(Scanner scanner, Player player1) {
        System.out.println("Enter your choice for RPS");
        String choice = scanner.next().toLowerCase();
        String cpuChoice = determineCPUChoice();
        System.out.println("My choice tho is " + choice);

        String playerOutcome = determineWinner(choice, cpuChoice);

        if (playerOutcome.equals("won")) {
            System.out.println("CONGRATS! You WON against CPU! You played " + choice + " while CPU played " + cpuChoice + ".");
            player1.incrementGamesWon();
        } else if (playerOutcome.equals("lost")) {
            System.out.println("Aww shucks. You lost against CPU. You played " + choice + " while CPU played " + cpuChoice + ".");
            player1.incrementGamesLost();
        } else if (playerOutcome.equals("tied")) {

            System.out.println("It's a tie! You and the computer both played " + choice + ".");
            player1.incrementGamesTied();

        } else if (playerOutcome.equals("invalid")) {
            System.out.println("You entered in an invalid input so this game is void");
        }
        System.out.println("Against the CPU, you have " + player1.getGamesWon() + " wins, " + player1.getGamesLost() + " losses, and " + player1.getGamesTied() + " ties.");
    }

    private String determineWinner(String playerChoice, String opponentChoice) {
        if (playerChoice.toLowerCase().equals(opponentChoice.toLowerCase())) {
            return "tied";
        } else if (playerChoice.equals("rock")) {
            if (opponentChoice.equals("paper")) {
                return "lost";
            } else if (opponentChoice.equals("scissors")) {
                return "won";
            }
        } else if (playerChoice.equals("paper")) {
            if (opponentChoice.equals("rock")) {
                return "won";
            } else if (opponentChoice.equals("scissors")) {
                return "lost";
            }
        } else if (playerChoice.equals("scissors")) {
            if (opponentChoice.equals("rock")) {
                return "lost";
            } else if (opponentChoice.equals("paper")) {
                return "won";
            }
        }
        return "invalid";
    }

    private String determineCPUChoice() {
        Random random = new Random();
        int randomInteger = random.nextInt(2);
        String cpuChoice = rpsChoices[randomInteger].toLowerCase();
        System.out.println("cpu Choice is " + cpuChoice );
        return cpuChoice;
    }

}
