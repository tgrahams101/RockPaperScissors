package com.company;

public class Player {
    private int gamesWon;
    private int gamesTied;
    private int gamesLost;

    Player() {
        this.gamesWon = 0;
        this.gamesTied = 0;
        this.gamesLost = 0;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesPlayed() {
        return gamesWon + gamesLost + gamesTied;
    }

    public void incrementGamesWon() {
        this.gamesWon++;
    }

    public void incrementGamesTied() {
        this.gamesTied++;
    }

    public void incrementGamesLost() {
        this.gamesLost++;
    }
}
