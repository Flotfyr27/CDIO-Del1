package spil;


import com.sun.deploy.util.Waiter;
import javafx.beans.binding.When;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(2);
        GUI gui = new GUI();
        //The game loop. is active as long as no player has won
        do{
            for (Player player : game.players) {
                while (!gui.buttonPressed) {
                }

                gui.buttonPressed = false;

                gui.WriteMessage(player.NAME + " your turn!");
                player.main();
                gui.WriteMessage(player.getRollLog());
                player.setRollLog("");

                if (player.GetWon()) {
                    gui.WriteMessage(player.NAME + " Won!");
                    return;
                }

            }
        } while (!game.CheckForWin(game.players));
    }

}
