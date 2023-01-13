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
        int randomGameSpace = random.nextInt(gameSpace) + 1;
        int getSpaceRemain = gameSpace - randomGameSpace;

        for(int i=0; i < dieRollCount; i++){
            if(rollDie == 6 && randomGameSpace == 20){
                System.out.println("You've rolled a " + rollDie + "." + " You're on space " + randomGameSpace + "." + " congrats you win.");
            }else{
                System.out.println("You've rolled a " + rollDie + "." + " You're now on space " + randomGameSpace + " and have " + getSpaceRemain + " more to go.");
            }
        }

    }
}
