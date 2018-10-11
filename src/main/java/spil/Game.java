/**
 * This is the main class of the game. this class controls which player can act, and when the game is running.
 */
package main.java.spil;
//import gui_main.gui;

public class Game {

    public static void main(String[] args) {
        int numberOfPlayers = 2;
        Player[] players = CreatePlayers(numberOfPlayers);

        //The game loop. is active as long as no player has won
        do{
            for (Player player : players) {
                player.main();

                if (player.GetWon()) {
                    System.out.println(player.name + " Won!");
                    return;
                }
            }
        } while (!CheckForWin(players));


    }

    private static Player[] CreatePlayers(int numberOfPlayers){
        Player[] players = new Player[numberOfPlayers];

        for (Player player : players) {
            player = new Player();
        }
        return players;
    }

   //A function which checks all players for having won
    private static boolean CheckForWin(Player[] players){
        for (Player player : players) {
            if (player.GetWon())
                return true;
        }
        return false;
    }
}
