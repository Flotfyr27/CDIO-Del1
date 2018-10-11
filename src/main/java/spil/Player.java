
package spil;
public class Player {

    private static int numberOfPlayers = 0;
    String name;
    private boolean won;

    //The method being invoked by the Game when it's the players turns.
    public void main() {
        System.out.println(name);
    }

    public Player(){
        won = false;
        name = "Player" + ++numberOfPlayers;
    }

    public void SetWon(boolean arg){
        won = arg;
    }

    public boolean GetWon(){
        return won;
    }

    //Brug SecureRandom rand = new SecureRandom();
}
