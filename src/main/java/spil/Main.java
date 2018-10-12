package spil;


import com.sun.deploy.util.Waiter;
import javafx.beans.binding.When;

import javax.sound.midi.Soundbank;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(2);
        GUI gui = new GUI();
        //The game loop. is active as long as no player has won
        do{
            for (Player player : game.players) {
                gui.WriteMessage(gui.getMessage() + "\n" + player.NAME + " your turn!");
                //waits until the button is pressed;
                while (!gui.buttonPressed) {
                    System.out.print("");
                }

                gui.buttonPressed = false;

                player.main();
                gui.WriteMessage("You rolled: \n" + player.getRollLog());
                player.setRollLog("");
                gui.setScore(player.NAME, player.getScore());

                if (player.GetWon()) {
                    gui.WriteMessage(player.NAME + " Won!");
                    return;
                }
            }
        } while (!game.CheckForWin(game.players));
    }

}
