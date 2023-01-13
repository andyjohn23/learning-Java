package roll_die_game;

import java.util.Random;

public class RollDieGame {
    public static void main(String[] args){
//        initialize known values
        int gameSpace = 20;
        int totalDieNumber = 6;
        int dieRollCount = 5;
        int currentSpace = 0;

        System.out.println("WELCOME TO THE ROLL DIE GAME!!!. Let's begin.");

        Random random = new Random();
        int rollDie = random.nextInt(totalDieNumber) + 1;
        int randomGameSpace = currentSpace + rollDie;
        int getSpaceRemain = gameSpace - randomGameSpace;

        for(int i=1; i < dieRollCount; i++){
            if(randomGameSpace == 20){
                System.out.println("You've rolled a " + rollDie + "." + " You're on space " + randomGameSpace + "." + " congrats you win.");
                break;
            }else if(randomGameSpace > gameSpace){
                System.out.println("Unfortunately you have lost the game");
                break;
            }else if(i==dieRollCount && randomGameSpace < gameSpace){
                System.out.println("You're on space " + randomGameSpace + ".");
                System.out.println("Unfortunately you did not make it to all " + gameSpace + ", you lose!!!");
                break;
            }
            else{
                System.out.println("You've rolled a " + rollDie + "." + " You're now on space " + randomGameSpace + " and have " + getSpaceRemain + " more to go.");
            }
        }

    }
}
