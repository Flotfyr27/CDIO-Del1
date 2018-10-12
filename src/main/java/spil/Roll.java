package spil;

public class Roll {
    private int value1;
    public int value2;
    Die die = new Die();

    public Roll(){
        RollDice();
    }

    public void  RollDice(){
        value1 = die.RollDie();
        value2 = die.RollDie();
    }

    public int GetAddedScore(){
        return value1 + value2;
    }

    public boolean IsDoubleValue(){
        if (value1 == value2)
            return true;
        else
            return false;
    }

    public boolean isSnakesEyes(){
        if (value1 == 1 && value2 == 1)
            return true;
        else
            return false;
    }

    public String ToString(){
        return "(" + value1 + ", " + value2 + ")";
    }
}
