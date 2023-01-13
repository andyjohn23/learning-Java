package roll_die_game;

import java.util.Random;

public class RollDieGame {
    public static void main(String[] args){
//        initialize known values
        int gameSpace = 20;
        int totalDieNumber = 6;
        int dieRollCount = 5;

        Random random = new Random();
        int rollDie = random.nextInt(totalDieNumber) + 1;

    }
}
