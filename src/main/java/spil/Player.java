
package spil;


import java.awt.*;

public class Player {

    private static Roll roll = new Roll();
    private static int numberOfPlayers = 0;
    final String NAME;

    private int score;
    private boolean won;
    private boolean rolledDoubble;
    private Roll lastRoll;

    private String rollLog;

    //The method being invoked by the Game when it's the players turns.
    public void main() {
        do{
            rolledDoubble = false;
            roll.RollDice();

            if (roll.IsDoubleValue())
                rolledDoubble = true;

            score += roll.GetAddedScore();

            if (roll.isSnakesEyes()) {
                score = 0;

            }

            rollLog = rollLog.concat("score: " + roll.toString() + "\n");

            if (CheckWin()) {
                won = true;
                return;
            }

            lastRoll = roll;

        } while (rolledDoubble);
    }

    public Player(){
        won = false;
        score = 0;
        NAME = "Player " + ++numberOfPlayers;
        rollLog = "";
        lastRoll = roll;
    }


    public boolean GetWon(){
        return won;
    }

    public boolean CheckWin(){
        if (score >= 40)
            return true;
        if (lastRoll.GetAddedScore() == 12 && roll.GetAddedScore() == 12) //checks if both dice in both rolls were 6'
            return true;
        else
            return false;
    }

    public String getRollLog() {
        return rollLog;
    }

    public void setRollLog(String rollLog) {
        this.rollLog = rollLog;
    }

    public int getScore() {
        return score;
    }
}
