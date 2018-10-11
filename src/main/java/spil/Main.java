package spil;
import gui_main.GUI;


public class Main {
    public static void main(String[] args) {

        GUI gui = new GUI();
        Game game = new Game(2);

        //The game loop. is active as long as no player has won
        do{
            for (Player player : game.players) {
                player.main();

                if (player.GetWon()) {
                    System.out.println(player.name + " Won!");
                    return;
                }
            }
        } while (!game.CheckForWin(game.players));
    }

}
