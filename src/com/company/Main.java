package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //instatiate Scanner object
        Scanner scanner = new Scanner(System.in);

        //Start Rock Paper Scissors Game!
        RockPaperScissors.startGameModule(scanner);

        //close Scanner
        scanner.close();
    }
}
