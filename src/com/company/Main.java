package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean active = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play Rock, Paper, Scissors?");
        String answer = scanner.next();
        if (answer.toLowerCase() != "no") {
            active = true;
        }
        while (active) {
            RockPaperScissors.testScanner(scanner);

            System.out.println("Continue Game? press exit to leave");
            String exitCheck = scanner.next();
            System.out.println(exitCheck);
            if (exitCheck.toLowerCase().equals("exit") ) {
                System.out.println("Goodbye. You have exited Rock, Paper, Scissors. Hope to see you again :)");
                active = false;
            }
        }

        scanner.close();
    }
}
